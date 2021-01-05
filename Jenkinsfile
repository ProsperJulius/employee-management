pipeline {
    agent any
    tools {
        maven 'Maven'
   
    }
    stages {
        stage('SCM checkout'){
            steps{
             echo 'hey jusasane its now working'
            }
        }
        stage('Maven Build') {
            steps {
                
                sh 'mvn clean package'
                echo 'this prosper'
                
            }
        }
         stage('Docker Build') {
                    steps {   
                         script{
           
                 sh 'docker build .
            
                             
        }
                     
                
                    }
                }
    }
}


