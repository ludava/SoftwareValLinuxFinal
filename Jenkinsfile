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
        echo 'Test Case 1: Add an email to CC and test if that newly added email exists - QBW___'
        echo 'Test 2: Add two emails to the CC array and test if they both exist  - QBW___'
      }
    }

    stage('Delivery') {
      steps {
        sh 'echo "Reached DELIVERY STAGE: Software Val and Quality Assurance Final Project - QBW___"'
      }
    }

  }
}