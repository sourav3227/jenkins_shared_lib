def call(){
  sh "chmod -R 777 ./jfrog.py"
  sh './jfrog.py'
}
