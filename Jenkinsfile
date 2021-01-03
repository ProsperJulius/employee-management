pipeline {
    agent any
    stages {
        stage('SCM checkout'){
            steps{
            def gitHome = tool name: 'Default', type: 'git'
                sh "${gitHome} git 'https://github.com/ProsperJulius/employee-management' "
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
                     sh 'docker build -t employee-management'
                    }
                }
    }
}


