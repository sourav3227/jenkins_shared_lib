def call(){
  sh "chmod +x -R ${env.WORKSPACE}"
  sh './jfrog.py'
}
