
node {
     stage('Build image') {
         app = docker.build("public.ecr.aws/j7y6o5w0/asdf")
     }

     stage('Push image') {
        sh 'rm -f ~/.dockercfg ~/.docker/config.json || true'
         docker.withRegistry('https://public.ecr.aws/j7y6o5w0/asdf', 'ecr:ap-northeast-2:ecr') {
             app.push("${env.BUILD_NUMBER}")
             app.push("latest")
     }
  }
}
//  node {
//      stage('Clone repository') {
//          checkout scm
//      }
//
//      stage('Build image') {
//          app = docker.build("teichae/jenkins:$BUILD_NUMBER")
//      }
// }