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

                bat 'docker compose build'

            }

        }

        stage('Testes'){

            steps{

                bat 'docker compose run projeto mvn test'

            }

        }

    }

}