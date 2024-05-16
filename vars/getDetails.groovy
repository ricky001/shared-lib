def call(){

  if (isUnix()) {
        def uname = sh script: 'uname', returnStdout: true
        if (uname.startsWith("Darwin")) {
            echo "Macos"
        }
        // Optionally add 'else if' for other Unix OS  
        else {
            echo "Linux"
        }
    }
    else {
        echo "Windows"
    }

}
