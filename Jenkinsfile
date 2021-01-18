#!groovy
pipeline {
    agent any

    stages {
        stage("build it") {
            when {
                expression {
                    GIT_BRANCH == "hello"
                }
            }
            steps {
                sh """
                ./mvnw clean install
"""
            }
        }

    }

}