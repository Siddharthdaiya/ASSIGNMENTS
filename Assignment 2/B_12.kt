package `Assignment 2`

fun main() {

    println("enter the value for fibonacci series :-")
    var n = readLine()!!.toInt()
    var a = 0
    var b = 1
    var fibonacci = 0
    for (i in 2..n){

        fibonacci=a+b
        println("$fibonacci")
        a=b
        b=fibonacci

    }

}