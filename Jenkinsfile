pipeline {
  agent any
  tools {
        maven 'maven 3.8.6'
    }
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

  }
}
