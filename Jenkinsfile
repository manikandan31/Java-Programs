pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        tool 'Java'
        echo 'Java Compile Stage'
        bat 'java -version'
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