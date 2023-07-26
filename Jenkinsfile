pipeline {
    agent any
    triggers {
        cron('*/2 * * * 1')
    }
    tools {
        maven 'maven'
        jdk 'java'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mastermous/palindrome.git'
            }
        }
        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonarqube') { 
                    bat 'mvn sonar:sonar'
                }
            }
        }
        stage('Nexus deployment') {
            steps {
                nexusArtifactUploader artifacts: [[artifactId: 'mouhamadou_mane', classifier: '', file: 'target/mouhamadou_mane-0.0.1-SNAPSHOT.jar', type: 'jar']], credentialsId: 'nexus', groupId: 'com.groupeisi.m2gl', nexusUrl: 'localhost:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'palindrome', version: '0.0.1-SNAPSHOT'
            }
        }
    }
}
