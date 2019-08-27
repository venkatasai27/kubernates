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
//sh 'docker build . -t venkat'
docker.withRegistry(credentialsId: 'b2f908af-c4ab-4183-aef5-892c734913d1', url: 'https://cloud.docker.com'){
 def customImage = docker.build("my-image:venkat")

        /* Push the container to the custom Registry */
        customImage.push()
}
//sh("docker -- push https://cloud.docker.com/u/mani9056/repository/docker/mani9056/kubernates-demo")
 //sh "docker login -u=\"mani9056\" -p=\"MANIkanta@9533\" https://cloud.docker.com"
 //sh "docker push https://cloud.docker.com/u/mani9056/repository/docker/mani9056/kubernates-demo"
 //sh "docker logout https://cloud.docker.com"
}
}
}
}