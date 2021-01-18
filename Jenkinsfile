#!groovy
pipeline {
    agent any

    stages {
        stage("build it") {
            steps {
                sh """
                ./mvnw clean install
"""
            }
        }
    }
}