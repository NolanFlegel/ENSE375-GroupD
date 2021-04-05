  
pipeline {

  environment {
  registry = "NolanFlegel/ENSE375-GroupD"
  registryCredential = 'dockerhub_id'
  dockerImage = ''
  }

  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

  }
  
 

  stages {

    stage('Cloning our Git') {
      steps {
        git 'https://github.com/NolanFlegel/ENSE375-GroupD.git'
      }
    }

    stage('Change Directory') {
      steps {
        dir(path: 'RiskMeter') {
          sh 'mvn clean test'
        }
      }
    }

    stage('Building our image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }

  stage('Deploy our image') {
    steps{
      script {
        docker.withRegistry( '', registryCredential ) {
          dockerImage.push()
        }
      }
    }
  }

  stage('Cleaning up') {
    steps{
      sh "docker rmi $registry:$BUILD_NUMBER"
    }
  }
}

}

