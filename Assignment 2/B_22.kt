package `Assignment 2`

fun main() {
    var n = 1634
    val temp = n
    var sum = 0
    var rem: Int
    while (n != 0) {
        rem = n % 10
        sum += (rem * rem * rem * rem)
        n /= 10
    }

    if (sum == temp) {
        println("Given number is Armstrong")
    } else {
        println("Given number is not armstrong")
    }
}