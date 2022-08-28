fun main() {
    var low = 20
    val high = 90

    while (low < high) {
        var flag = false

        for (i in 2..low / 2) {

            if (low % i == 0) {
                flag = true
                break
            }
        }

        if (!flag)
            print("$low ")

        low++
    }
} 