
pipeline{
agent any
stages{
stage ('Build'){
steps{
sh 'mvn clean package'
sh 'docker build . -t venkat'
sh 'docker tag venkat mani9056/kubernates-demo'
sh 'docker login --username=mani9056 --password=MANIkanta@9533'
sh 'docker push mani9056/kubernates-demo'
}
}
}
}
