pipeline {
  agent any
  tools {
        maven 'Maven 3.8.6'
        jdk 'Java17'
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
