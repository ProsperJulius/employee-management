pipeline {
    agent any
    stages {
        stage('SCM checkout'){
            steps{
             sh 'echo hey jusasane'
            }
        }
        stage('Maven Build') {
            steps {
                def mvnHome = tool name: 'Maven3', type: 'maven'
                sh "${mvnHome} mvn clean package"
                
            }
        }
         stage('Docker Build') {
                    steps {   
                     docker = 'Docker'
                     sh 'docker build -t employee-management'
                    }
                }
    }
}


