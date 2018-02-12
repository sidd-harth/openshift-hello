	// Run this node on a Maven Slave 
	// Maven Slaves have JDK and Maven already installed 
	node { 
	  // First stage: Build the War File 
	  stage('Build war file') { 
	    // Get Source Code from SCM (Git) as configured in the Jenkins Project 
	    checkout scm 
	 
	    // Now invoke the Maven Build 
	    sh "mvn clean package -DskipTests" 
	  } 
	  // Second Stage: Save the WAR file for later use 
	  stage('Archive war') { 
	    archive 'target/*.jar' 
	  } 
} 

