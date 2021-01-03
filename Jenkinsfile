pipeline {
    agent any
    stages {
        stage('SCM checkout'){
            steps{
             echo 'hey jusasane its now working'
            }
        }
        stage('Maven Build') {
            steps {
                //mvnHome = tool name: 'Maven3', type: 'maven'
                //sh "${mvnHome} mvn clean package"
                
            }
        }
         stage('Docker Build') {
                    steps {   
                     ///docker = 'Docker'
                     //sh 'docker build -t employee-management'
                        echo 'soon it will work baby'
                    }
                }
    }
}


