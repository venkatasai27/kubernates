pipeline{
agent any

environment {
    registry = "mani9056/kubernates-demo"
    registryCredential = "dockerhub"
}
stages{
stage ('Build'){
steps{
sh 'mvn clean package'
sh 'docker build . -t venkat'
 sh "docker login -u=\"mani9056\" -p=\"MANIkanta@9533\" https://hub.docker.com/"
 sh "docker push https://cloud.docker.com/u/mani9056/repository/docker/mani9056/kubernates-demo"
 sh "docker logout https://hub.docker.com"
}
}
}
}