pipeline {
    agent any
    stages {
        stage('UI Build') {
            steps {
                sh 'echo "UI Build in process"'
            }
        }
        stage('Java Build') {
            steps {
                sh 'echo "Java Build in process"'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Tests in proecess"'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploy started"'
            }
        }
    }
}