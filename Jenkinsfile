pipeline{
agent spark
    stages{
    stage('Complie Stage')
    {
       steps{
    sh 'sbt clean compile'
            }
     }
    stage ('Unit')
        {
       steps{
    sh 'sbt test'
            }
        }
    }
}