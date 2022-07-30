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
               bat 'npm install'
             }
         }
        
//         stage('deploy'){
//             steps{
//                 sshagent(credentials:['splashuser']) {
//                     sh 'scp -o StrictHostKeyChecking=no server.js ec2-user@54.175.171.97:/home/ec2-user'
//                     sh 'scp -o StrictHostKeyChecking=no package.json ec2-user@54.175.171.97:/home/ec2-user'
//                     sh 'scp -o StrictHostKeyChecking=no package-lock.json ec2-user@54.175.171.97:/home/ec2-user'
//                     sh 'scp -o StrictHostKeyChecking=no node_modules ec2-user@54.175.171.97:/home/ec2-user'
//                     sh 'scp -o StrictHostKeyChecking=no Dockerfile ec2-user@54.175.171.97:/home/ec2-user'
//                     sh 'scp -o StrictHostKeyChecking=no .dockerignore ec2-user@54.175.171.97:/home/ec2-user'
//             }
//             }
//         }

//         stage('RUN nodejs app'){
//             steps{
//                 sshagent(credentials:['splashuser']) {
//                     sh 'ssh -o StrictHostKeyChecking=no -l ec2-user@54.175.171.97 pm2 start -n nodejsapp server.js'
//                     sh 'ssh -o StrictHostKeyChecking=no -l ec2-user@54.175.171.97 pm2 save'
//                     ///creating a dockerimage using dockerfile
//                     sh 'ssh -o StrictHostKeyChecking=no -l ec2-user@54.175.171.97 docker build -t my_node_image .'
//                     /// deploy the docker image to docker hub
//                     sh 'ssh -o StrictHostKeyChecking=no -l ec2-user@54.175.171.97 docker image push imagename'

//             }
//             }
//         }
        
    }
}
        
