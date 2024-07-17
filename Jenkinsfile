pipeline {
    agent any
    
    tools {
        maven 'maven'
        jdk 'JDK17'
    }
   // environment {
        //LAUNCH4J = 'C:/Program Files (x86)/Launch4j/'
        //ISCC     = 'C:/Program Files (x86)/Inno Setup 6/'
   // }
    
    stages {
        stage("Tools initialization") {
            steps {
                bat "mvn --version"
                bat "java -version"
                bat "launch4j.exe --version"
                //bat "\"%ISCC%ISCC.exe\" /?"
            }
        }
        
        stage("Checkout Code") {
            steps {
                git branch: '$BRANCH',
                credentialsId: 'dorjanshurdhi',
                url: "https://github.com/dorjanshurdhi/iTRAVEL.git"
            }
        }
        
        stage("Building Application") {
            steps {
               bat "mvn clean package -DSkipTest=true"
            }
        }
        
        //stage('Archive Artifacts') {
        //    steps {
        //        // Archive the executable
        //        archiveArtifacts artifacts: 'target/*jar-with-dependencies.jar', fingerprint: true
        //    }
        //}
        
        stage('Create .EXE') {
            steps {
                // create .exe application
                bat "launch4jc.exe setup\\launch4j_config.xml"
            }
        }
        
        stage('Create SETUP') {
            steps {
                // create setup
               bat "ISCC.exe setup\\inno_setup.iss"
            }
        }
        
        stage('Archive Setup.exe') {
            steps {
                // Archive the executable
                archiveArtifacts artifacts: 'setup/TRAVEL-0.0.1-Setup.exe', fingerprint: true
            }
        }
    }
 }
 