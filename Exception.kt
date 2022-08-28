fun main() {
  try {
      var array= arrayOf("SIDDHARTH","AYUSH","AMIT"<"KRUSHIL")
      println("array at index 2 is :- ${array[5]}")
  }catch (e:ArrayIndexOutOfBoundsException){
      println("array of index out of obound exception handled")
  }



try {
    var number="123ea"
    println(number.toInt()*2)

}
catch (e:java.lang.NumberFormatException){
    println("NUmber format exception handled")
}
   try {
       var str:String?=null
       println("lenght${str!!.length}")
   }catch (e:NullPointerException){
       println("null pointer exception handled")
   }

    println("ALL CODE ARE EXECUTED")

}