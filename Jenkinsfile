
node {
    env {
        ECR_ID = '884868906286'
        REPOSITORY_NAME = 'test'
        AWS_REGION = 'ap-northeast-2'
        AWS_ECR_CREDENTIAL = 'ecr'
    }

     stage('Clone repository') {
         checkout scm
     }

     stage('build project') {
        sh './gradlew clean'
        sh './gradlew build'
     }

     stage('Build image') {
         app = docker.build("${env.ECR_ID}.dkr.${env.AWS_REGION}.amazonaws.com/${env.REPOSITORY_NAME}:${env.BUILD_NUMBER}")
     }

     stage('Push image') {
         sh 'rm -f ~/.dockercfg ~/.docker/config.json || true'
         docker.withRegistry('https://${env.ECR_ID}.dkr.ecr.${env.AWS_REGION}.amazonaws.com', 'ecr:${env.AWS_REGION}:${env.AWS_ECR_CREDENTIAL}') {
             app.push("${env.BUILD_NUMBER}")
             app.push("latest")
     }
  }
}
//  node {

//
//      stage('Build image') {
//          app = docker.build("teichae/jenkins:$BUILD_NUMBER")
//      }
// }