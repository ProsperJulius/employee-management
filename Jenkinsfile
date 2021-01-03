pipeline {
    agent any
    stages {
        stage('Maven Build') {
            steps {
                def mvnHome = tool name: 'Maven3', type: 'maven'
                sh "${mvnHome} mvn clean package"
            }
        }
         stage('Docker Build') {
                    steps {   
                     sh 'docker build -t employee-management'
                    }
                }
    }
}


