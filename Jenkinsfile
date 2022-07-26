pipeline {
    agent any

    stages {
        stage('git clone'){
            steps {
               git branch: 'main', url: 'https://github.com/vphanideep/building_nodejs.git'

            }
        }

        stage('building nodejs app'){
             steps {
               // bat 'npm install'
                 bat 'zip -r archivename.zip *'
             }
         }
        
        stage('deploy'){
            steps{
                sshagent(credentials:['splashuser']) {
                    
                    sh 'scp -o StrictHostKeyChecking=no * ec2-user@54.175.171.97:/home/ec2-user'
            }
            }
        }
        
    }
}
        
