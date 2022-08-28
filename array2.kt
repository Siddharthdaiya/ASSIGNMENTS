fun main() {

   var numbers= IntArray(5)
    var sum =0
    for(index in numbers.indices){
        println("Enetr the value at index-$index :")

        var num= readLine()!!.toInt()

        numbers[index]=num
        sum+=numbers[index]

    }
    println("addition of array elements : $sum")
}