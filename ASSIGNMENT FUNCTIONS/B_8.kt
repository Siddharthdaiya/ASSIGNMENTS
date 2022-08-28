package ` ASSIGNMENT FUNCTIONS`

fun multiplyNumbers(num: Int): Long {
    if (num >= 1)
        return num * multiplyNumbers(num - 1)
    else
        return 1
}

fun main() {
    val num = 6
    val factorial = multiplyNumbers(num)
    println("Factorial of $num = $factorial")
}
