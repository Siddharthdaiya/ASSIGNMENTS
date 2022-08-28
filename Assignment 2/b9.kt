fun main() {

    println("enter the natural number :-")
    var num = readLine()!!.toInt()
    var sum:Long = 0
    for (i in 0..num){
        sum+=i
    }
    println("sum of natural number is $sum")
}