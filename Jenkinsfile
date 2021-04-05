pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Unit tests') { 
            steps {
              dir(path: 'RiskMeter') {
                sh 'mvn clean test'
            }
          }
        }
        stage('Scan with Probely') {
            steps {
                probelyScan targetId: '3Ky3mxM6gERJ', credentialsId: 'probely-test'	
            }
         }
    }
}