package `Assignment 2`

fun main() {

    val num = 5
    var base = 3

    var result:Long = 1

    while (base!=0){

        result*=num.toLong()
        base--
    }
    println("result : $result")
}