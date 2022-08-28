package ` ASSIGNMENT FUNCTIONS`

fun main() {
    val n1 = 366
    val n2 = 200
    val gcd = gcd(n1, n2)

    println("G.C.D of $n1 and $n2 is $gcd.")
}

fun gcd(n1: Int, n2: Int): Int {
    if (n2 != 0)
        return gcd(n2, n1 % n2)
    else
        return n1
}
