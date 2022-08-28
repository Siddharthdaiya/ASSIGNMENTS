fun main() {
    val str = "tops technoliges"
    val ch = 'e'
    var frequency = 0
    for (i in 0..str.length - 1)
    {
        if (ch == str[i]) {
            ++frequency
        }
    }
    println("frequency of $ch = $frequency")


}