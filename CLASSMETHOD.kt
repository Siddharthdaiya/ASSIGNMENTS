import java.io.File

fun main() {
    var file= File("C:\\")
    var fileArray=file.listFiles()

    for(file in fileArray){
        println("name: ${file.name}  isDir: ${file.isDirectory} isfile: ${file.isFile}  isHidden: ${file.isHidden}")
    }
}