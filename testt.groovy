pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
              script {
                "cat  ${workspace}/current.txt | tr [:lower:] [:upper:]".trim() + ".zip" 
              }
            }
        }
    }
}
