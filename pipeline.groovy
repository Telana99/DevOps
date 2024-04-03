pipeline {
  agent any

  stages {
    satge('Stage-1'){
      steps {
        echo 'satge-1 completed'
      }
    }
satge('Stage-2'){
      steps {
        echo 'satge-2 completed'
      }
    }

satge('Stage-3'){
      steps {
        echo 'satge-3 completed'
      }
    }

  }
}
    
