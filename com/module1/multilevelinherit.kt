open class BaseClass(var name:String){
    fun testa(){
        println("testA")
    }
}
open class ChildClass:BaseClass("chercher tech"){
    fun testb(){
        println("testB")
    }
}
class GrandChildClass:ChildClass(){
    fun testc(){
        println("testC")
    }
}
fun main(args: Array<String>)
{
    var gc = GrandChildClass()
    // calling methods from base and child classes
    gc.testa()
    gc.testb()
    gc.testc()
}

