
node {

     stage('Clone repository') {
         checkout scm
     }

     stage('build project') {
        sh './gradlew clean'
        sh './gradlew build'
     }

     stage('Build image') {
         app = docker.build("${params.ECR-ID}.dkr.ecr.ap-northeast-2.amazonaws.com/test:${env.BUILD_NUMBER}")
     }

     stage('Push image') {
         sh 'rm -f ~/.dockercfg ~/.docker/config.json || true'
         docker.withRegistry('https://${params.ECR-ID}.dkr.ecr.ap-northeast-2.amazonaws.com', 'ecr:ap-northeast-2:${CREDENTIAL}') {
             app.push("${env.BUILD_NUMBER}")
             app.push("latest")
     }
  }
}