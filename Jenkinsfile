pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn testmvn test'
      }
    }

    stage('Delivery') {
      steps {
        echo 'Made it to delivery'
      }
    }

  }
}