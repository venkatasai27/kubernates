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
}
}
stage ('Test'){
steps{
sh 'mvn install'
}
}
}
}