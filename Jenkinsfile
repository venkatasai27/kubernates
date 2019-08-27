pipeline {

   agent any
   stages {
       stage('Preparation') { // for display purposes
            agent { node "master" }
        	  steps {
        		git credentialsId: 'GITHUB_CRED', url: 'https://github.com/nvramana8121/DemoRepository.git'
        	  }
        }

       stage('Build') {
          // Run the maven build
    	    agent { node "master" }
    	    steps {
                sh ("mvn clean package")
            }
        }

       stage('Docker Build') {
            agent {node "master" }
            steps {
    			checkout scm
                sh("docker build -f Dockerfile .")
                sh("docker login --username=\"venkatnatte\" --password-stdin https://cloud.docker.com")
                sh("docker push https://cloud.docker.com/repository/docker/venkatnatte/mydocker-repo")
                sh("docker logout https://cloud.docker.com")
    		}
                // some block
		}
	}

	}