package `Assignment 2`

fun main() {

    var num = 434243
    var count = 0

    while (num != 0){
        num/=10
        count++
    }

    println("number of digit $count")
}