package `Assignment 2`

fun main() {
    val n1 = 60
    val n2 = 100
    var gcd = 1

    var i = 1
    while (i <= n1 && i <= n2) {
        if (n1 % i == 0 && n2 % i == 0)
            gcd = i
        ++i
    }

    println("GCD of $n1 and $n2 is $gcd")
}