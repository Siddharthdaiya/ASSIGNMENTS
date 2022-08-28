fun main() {
    println("enter the number for factorial :-")
    var num = readLine()!!.toInt()
    var fact:Long = 1
    for (i in 1..num){
        fact*=i
    }
    println("Factorial is $fact")
}
