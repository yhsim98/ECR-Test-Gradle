
node {
     stage('Clone repository') {
         checkout scm
     }

     stage('build project') {
        sh './gradlew clean'
        sh './gradlew build'
     }

     stage('Build image') {
         app = docker.build("884868906286.dkr.ecr.ap-northeast-2.amazonaws.com/test:${env.BUILD_NUMBER}")
     }

     stage('Push image') {
        sh 'rm -f ~/.dockercfg ~/.docker/config.json || true'
         docker.withRegistry('https://884868906286.dkr.ecr.ap-northeast-2.amazonaws.com', 'ecr:ap-northeast-2:ecr') {
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