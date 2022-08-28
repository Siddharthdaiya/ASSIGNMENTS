package `Assignment 2`


fun main() {
    var num = 23232
    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int

    originalInteger = num

    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }

    if (originalInteger == reversedInteger) {
        println("$originalInteger is a palindrome.")
    }
    else {
        println("$originalInteger is not a palindrome.")
    }
}