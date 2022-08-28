
import java.io.File

fun main() {
    var DIRECTORY="kotlin"
    var root=File("C:\\android",DIRECTORY)

    println("path : ${root.absolutePath}")

    if(!root.exists()){
        root.mkdir()

        var file=File(root,"TEST.txt")

        if(file.createNewFile()){
            println("FILE CREATED SUCCESFULLY")
        }
    }
//    var file=File("C:\\android\\sample.txt")
//    if(file.createNewFile()){
//        println("NEW FILE CREATED SUCCESFULLY")
//    }


}