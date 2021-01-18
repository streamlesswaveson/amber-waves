#!groovy
pipeline {
    agent any

    stages {
        stage("build it") {
            steps {
                """
                ./mvnw clean install
"""
            }
        }
    }
}