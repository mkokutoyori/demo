node{
    stage('Clone'){
        git 'https://github.com/mkokutoyori/demo.git'
    }
    stage('Test'){
        sh label: '', script: 'mvn clean test'
    }
    stage('Build'){
        sh label: '', script: 'mvn clean package'
    }
    stage('Run'){
        sh label: '', script: 'mvn spring-boot:run'
    }

}
