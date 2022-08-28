package `Assignment 2`

fun main() {

    var num = 12345
    var reversed = 0

    while (num!=0){
        val digit= num%10
        reversed=reversed*10+digit
        num/=10
    }

    println("reversed number is $reversed")
}