pipeline {
    environment{
        dockerimg=""
    }
    agent any

    stages {
        stage('Git Clone') {
            steps {
                git 'https://github.com/PrateekGarg91/SPE_MiniProject.git'
            }
        }

        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker Build') {
            steps {
                script{
                dockerimg=docker.build "prateekgarg91/spe_miniproject:latest"
                }
            }
        }
        stage('Docker Push Image') {
            steps {
                script{
                docker.withRegistry('','DockerHubID'){
                dockerimg.push()
                    }
                }
            }
        }
        stage('Docker Image Delete') {
            steps {
                script{
                    sh 'docker image rm -f prateekgarg91/spe_miniproject'
                }
            }
        }
        stage('Docker Image Pull via Ansible') {
            steps {
                    ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, inventory: 'inventory', playbook: 'deployansible.yml'
            }
        }

    }

}
