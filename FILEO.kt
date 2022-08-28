import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
fun main() {
    var DIR = "Kotlin"
    var root = File("C:\\android", DIR)

    println("path :${root.absolutePath}")

    if (!root.exists()) {
        println(root.mkdir())
    }
    var file = File(root, "Test.txt")

    if (file.createNewFile()) {
        println("file created successfully")
    }

    println("""
        1.write data
        2.read data
    """.trimIndent())

    print("Enter your choice")
    var choice = readLine()!!.toInt()

    when (choice) {
        1 -> {
            writeData(file)
        }
        2 -> {
            readData(file)
        }

    }

}

fun readData(file:File){
    try {
        var fin = FileInputStream(file)

        var byteArray = ByteArray(fin.available())
        fin.read(byteArray)

        var message = String(byteArray)
        println("$message")

        fin.close()
    }
    catch (e: Exception){

        e.printStackTrace()
    }

}
fun writeData(file:File){
    try {

        print("Enter message : ")
        var message = readLine()

        var fout = FileOutputStream(file, true)
        fout.write(message!!.toByteArray())
        fout.close()

        println("Data saved successfully")

    } catch (e: Exception) {
        e.printStackTrace()
    }

}