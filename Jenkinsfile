pipeline {
    agent any

    stages {
        stage ('Package Stage') {

            steps {
                withMaven(maven : 'apache-maven-3.3.9') {
                   // Get Source Code from SCM (Git) as configured in the Jenkins Project
                    checkout scm

                    // Now invoke the Maven Build
                    sh "mvn clean package -DskipTests"
                }
            }
        }

        stage ('Archive jar') {

            steps {
                withMaven(maven : 'apache-maven-3.3.9') {
                    archive 'target/*.jar'
                }
            }
        }
    }
}
