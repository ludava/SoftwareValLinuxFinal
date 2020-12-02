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
        sh 'mvn test'
        echo 'Test 1- QBW___'
        echo 'Test 2 - QBW___'
      }
    }

    stage('Delivery') {
      steps {
        sh 'echo "Reached DELIVERY STAGE: Software Val and Quality Assurance Final Project - QBW___"'
      }
    }

  }
}