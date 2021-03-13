  
pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('Change Directory') {
      steps {
        dir(path: 'RiskMeter') {
          sh 'mvn clean test'
        }

      }
    }

  }
}
