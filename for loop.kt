fun main() {

    // for with range
    for(num in 1..10)
    {
        print("$num\t")
    }

    println()

    // until
    for(num in 1 until 10)
    {
        print("$num\t")
    }
    println()

    // reverse
    for(num in 10 downTo 1)
    {
        print("$num\t")
    }

    println()

    for(num in 20..40 step 3)
        print("$num\t")



}