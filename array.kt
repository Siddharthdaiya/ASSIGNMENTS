fun main() {
    var number= intArrayOf(20,10,30,40,50)
    var temple= floatArrayOf(32.5f,40.5f)
    var languages= arrayOf("java,kotlin,dart,python,C++")
    var sum=0


    for(i in number){
        println(i)
        sum+=i
    }
    println("summation : ${sum}")

    for(index in languages)
    {
        println(index)
    }

    println("value at index 1 : ${languages[3]}")

}