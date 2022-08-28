
fun armstrong() {
    var low = 99
    val high = 999

    while (low < high) {
        var flag = false

        var sum = 0
        var rem: Int
        while (low != 0) {
            rem = low % 10
            sum += (rem * rem * rem * rem)
            low /= 10
            low++
        }

        if (!flag)
            print("$low ")

        low++
    }
}

fun main() {

    armstrong()

}
