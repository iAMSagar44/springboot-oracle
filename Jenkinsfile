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
        dir(path: 'target') {
          fileExists 'getIndividualData-0.0.1-SNAPSHOT.jar'
        }

      }
    }

  }
  tools {
    maven 'Maven 3.8.6'
    jdk 'Java17'
  }
}