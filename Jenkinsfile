
node {

    parameters {
        string(name: "ECR-ID", defaultValue: "ddddddddd", trim: true, description: "ecr id")
        string(name: "CREDENTIAL", defaultValue: "ecr", description: "credential")
    }

     stage('Clone repository') {
         checkout scm
     }

     stage('build project') {
        sh './gradlew clean'
        sh './gradlew build'
     }

     stage('Build image') {
         app = docker.build("${paras.ECR-ID}.dkr.ecr.ap-northeast-2.amazonaws.com/test:${env.BUILD_NUMBER}")
     }

     stage('Push image') {
         sh 'rm -f ~/.dockercfg ~/.docker/config.json || true'
         docker.withRegistry('https://${paras.ECR-ID}.dkr.ecr.ap-northeast-2.amazonaws.com', 'ecr:ap-northeast-2:${CREDENTIAL}') {
             app.push("${env.BUILD_NUMBER}")
             app.push("latest")
     }
  }
}