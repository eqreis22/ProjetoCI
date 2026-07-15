pipeline {

    agent any

    stages {

        stage('Clone'){

            steps{

                checkout scm

            }

        }

        stage('Build'){

            steps{

                sh 'docker compose build'

            }

        }

        stage('Testes'){

            steps{

                sh 'docker compose run projeto mvn test'

            }

        }

    }

}