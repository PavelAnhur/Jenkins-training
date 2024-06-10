pipeline {
    agent any
    tools {
        jdk  'default'
        maven 'maven-3.9.7'
    }

    parameters {
        string(name: 'BRANCH', defaultValue: 'master', description: 'the branch of the repository to build')
    }

    environment {
        BUILD_NUMBER = "${env.BUILD_NUMBER}"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${params.BRANCH}", url: 'https://github.com/farshidmh/jenkins-java'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build') {
            steps {
                echo 'Building ${env.BUILD_NUMBER}...'
                sh 'mvn clean package'
            }
        }

        stage('Archive'){
            steps{
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

    }

    post {
        success {
            echo 'Build was successful'
        }

        failure {
            echo 'Build failed'
        }
    }
}
