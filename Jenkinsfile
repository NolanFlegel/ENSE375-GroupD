  
pipeline {
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
