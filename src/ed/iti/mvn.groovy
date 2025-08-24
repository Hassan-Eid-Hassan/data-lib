package ed.iti;

def build(OPTION){
    sh "mvn ${OPTION}"
}

def test(NULL){
    sh "mvn test"
}