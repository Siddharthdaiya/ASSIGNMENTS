package `Assignment 2`

fun main() {
    val number = 30

    print("Factors of $number are: ")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}