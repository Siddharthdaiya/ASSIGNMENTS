package `Assignment 2`

fun main() {

    println("enter the value for pattern")
    var count = readLine()!!.toInt()

    for (i in 1..count){
        for (j in 1..i){
            println("* ")
        }
        println()
    }

}