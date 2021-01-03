pipeline {
    agent any
    tools {
        maven 'Maven'
        docker 'Docker'
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
                     
                     sh 'docker build -t employee-management'
                        echo 'soon it will work baby'
                    }
                }
    }
}


