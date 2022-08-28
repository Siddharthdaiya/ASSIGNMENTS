abstract class hape(protected var num:Int)
{
    fun show (){
        println("value of num:$num")
    }
    abstract fun area()         // abstract method
    abstract fun display()

}

class circle(num:Int):hape(num ){
    override fun area() {
        println("area of circle is :${3.14*num *num}")
    }

    override fun display() {
        TODO("Not yet implemented")
    }


}


class square(num:Int):hape(num)
{
    override fun area() {
      println("Area of square is :${num*num}")
    }

    override fun display() {
        TODO("Not yet implemented")
    }

}


fun main() {
    var obj1=circle(10)
    var obj2=square(12)
    obj1.show()
    obj1.area()
    obj2.show()
    obj2.area()


}