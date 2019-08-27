pipeline{
agent any


stages{
stage ('Build'){
agent { node }
steps {
    sh 'mvn clean package'
    def dockerfile = 'Dockerfile.test'
    def customImage = docker.build("my-image:venkat", "-f Dockerfile ./dockerfiles")
    }
    }
//steps{
//sh 'mvn clean package'
//sh 'docker build . -t venkat'


//sh("docker -- push https://cloud.docker.com/u/mani9056/repository/docker/mani9056/kubernates-demo")
 //sh "docker login -u=\"mani9056\" -p=\"MANIkanta@9533\" https://cloud.docker.com"
 //sh "docker push https://cloud.docker.com/u/mani9056/repository/docker/mani9056/kubernates-demo"
 //sh "docker logout https://cloud.docker.com"
//}
}
}
}