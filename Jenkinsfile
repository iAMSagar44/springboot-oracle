pipeline {
  agent any
  stages {
    stage('Build Artefact') {
      steps {
        sh '''#List directories
ls -lt
'''
        sh 'mvn clean'
        sh 'mvn package'
      }
    }

    stage('Verify Artifact exists') {
      steps {
        sh 'pwd'
        sh 'ls -lt'
      }
    }

  }
  tools {
    maven 'Maven 3.8.6'
    jdk 'Java17'
  }
}