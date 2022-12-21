pipeline {
  agent any
  stages {
    stage('Build Artefact') {
      steps {
        sh '''#List directories
ls -lt
'''
        sh '''#Java version
java --version
which java'''
        sh 'mvn clean'
        sh 'mvn package'
      }
    }

  }
  tools {
    maven 'Maven 3.8.6'
    jdk 'Java17'
  }
}