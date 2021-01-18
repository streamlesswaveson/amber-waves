#!groovy
pipeline {
    agent any

    stages {
        stage("echo it") {
            steps {
                echo GIT_BRANCH
            }
        }
        stage("build it") {
            when {
                expression {
                    GIT_BRANCH == "origin/master"
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