  
pipeline {

  environment {
  registry = "sat112/ense375-test"
  registryCredential = 'sat112'
  dockerImage = ''
  }

 agent any
 stages {

    /*stage('Cloning our Git') { 
      steps {
        git 'https://github.com/NolanFlegel/ENSE375-GroupD.git'
      }
    }*/

    stage('Change Directory and Run Tests') {
      agent {
            docker {
                image 'maven:3-alpine'
                args '-v /root/.m2:/root/.m2'
                    }

                }
      steps {
         
        dir(path: 'RiskMeter') {
          sh 'mvn clean test'
        }
      }
    }

    stage('Building our image') {
      steps {
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }

  stage('Deploy our image') {
    steps {
      script {
        docker.withRegistry( '', registryCredential ) {
          dockerImage.push()
        }
      }
    }
  }

  stage('Cleaning up') {
    steps {
      sh "docker rmi $registry:$BUILD_NUMBER"
    }
  }
}

}

