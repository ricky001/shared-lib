def call(){

  if (isUnix()) {
        def uname = sh script: 'uname', returnStdout: true
        if (uname.startsWith("Darwin")) {
            return "Macos"
        }
        // Optionally add 'else if' for other Unix OS  
        else {
            return "Linux"
        }
    }
    else {
        return "Windows"
    }

}
