/*	// Run this node on a Maven Slave 
	// Maven Slaves have JDK and Maven already installed 
	node('maven') { 
	  // First stage: Build the War File 
	  stage('Build war file') { 
	    // Get Source Code from SCM (Git) as configured in the Jenkins Project 
	    checkout scm 
	 
	    // Now invoke the Maven Build 
	    sh "mvn clean package -DskipTests" 
	  } 
	  // Second Stage: Save the WAR file for later use 
	  stage('Archive war') { 
	    archive 'target/*.war' 
	  } 
} */

node {
    def app

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }
	
	stage('maven build') {
      
        sh "mvn clean package -DskipTests" 
    }
	stage('Archive war') { 
	    archive 'target/*.war' 
	  } 
}
