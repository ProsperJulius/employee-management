pipeline {
    agent any
    stages {
        stage('Maven Build') {
            steps {
             sh 'mvn clean package'
            }
        }
         stage('Docker Build') {
                    steps {
                     sh 'docker build -t employee-management'
                    }
                }
    }
}


