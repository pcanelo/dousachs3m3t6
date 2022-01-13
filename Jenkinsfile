pipeline {
  agent any
  stages {
    stage('paso1') {
      parallel {
        stage('paso1') {
          steps {
            echo 'msg de paso 1'
          }
        }

        stage('paso2') {
          steps {
            echo 'Paso 2'
          }
        }

      }
    }

  }
}