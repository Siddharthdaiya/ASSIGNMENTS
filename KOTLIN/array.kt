fun main() {
    var languages = arrayOf("java,kotlin,python,dart")
    var num =0
    for (lang in languages)
    {
        println (lang)
    }
    var nums= intArrayOf(44,22,55,31,52)
    var sum = 0

    println("value at index 2 : ${nums[2]}")

    for(i in nums)
    {
        sum+=i
        println(i)
    }
    println("summation : $sum")

}