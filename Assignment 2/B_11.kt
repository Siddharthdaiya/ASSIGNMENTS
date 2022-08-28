package `Assignment 2`

fun main() {

    println("enter the value for Table ")
    var number = readLine()!!.toInt()

    for (i in 1..10){

        println("$number X $i = ${number*i}")
    }

}