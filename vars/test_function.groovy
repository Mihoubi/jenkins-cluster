def call(){ node('agent'){
    stage('Build') {
        sh '''echo build steps'''
    }
    stage('Test') {
        sh '''echo test steps'''
    }
}
                          }
