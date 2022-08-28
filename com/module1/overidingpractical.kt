open class base(){
    open fun display(){
        println("base class is called")
    }
}
class Derived():base(){
    override fun display(){
        super.display()
        println("child class is called")

    }
}

fun main() {
    var d1=Derived()
    d1.display()

}