pipeline {
    agent any

    tools {
        maven "Maven 3.6.3"
    }

    options {
            skipDefaultCheckout()
    }

    stages {
        stage('build') {
            steps {
                echo 'build'
            }
        }
        stage('test') {
            steps {
                echo 'test'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy'
            }
        }
    }
}