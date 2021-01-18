#!groovy
pipeline {
    agent any

    stages {
        when {
            expression {
                GIT_BRANCH == "hello"
            }
        }
        stage("build it") {
            steps {
                sh """
                ./mvnw clean install
"""
            }
        }

    }

}