  pipeline {
    agent any

    tools {
        maven 'Maven-3.6.3'
    }

    environment {
        JAR_FILENAME = "math-service"
        JAR_VERSION = "1.0-SNAPSHOT"
    }

    stages {
        stage("Test") {
            steps {
                sh "mvn clean test"
            }
        }

        stage("Build") {
            steps {
                sh "mvn package -DskipTests"
            }
        }
    }
    post {
        always {
            echo "This will always be executed"
        }
        success {
            echo "This will be executed only when all stages succeed"
            junit '**/*xml'
            jacoco execPattern: '**/target/**.exec'
            archiveArtifacts artifacts: "target/${JAR_FILENAME}-${JAR_VERSION}.jar", followSymlinks: false
            deleteDir()
        }
    }
}