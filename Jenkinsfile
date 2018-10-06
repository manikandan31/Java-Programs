pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        echo 'Java Compile Stage'
        bat 'javac MissingNumber.java'
      }
    }
    stage('Test') {
      steps {
        echo 'Java Test Stage'
        bat 'java MissingNumber '
      }
    }
  }
}