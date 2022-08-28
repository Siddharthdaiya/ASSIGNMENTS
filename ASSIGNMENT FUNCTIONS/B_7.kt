package ` ASSIGNMENT FUNCTIONS`


fun addNumbers(num: Int): Int {
    if (num != 0)
        return num + addNumbers(num - 1)
    else
        return num
}

fun main() {
    val number = 5
    val sum = addNumbers(number)
    println("Sum = $sum")
}
