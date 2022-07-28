class Shape {
    fun circle (r:Int){
        var pi=3.14
      println("area of circle ${pi*r*r}")
    }
    fun rectangle (l:Int,b:Int){
        println("area of rectangle ${l*b}")
    }
}

fun main() {
    var s1=Shape()
    s1.circle(5)
    s1.rectangle(5,2)
}

