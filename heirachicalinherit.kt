open class A {
    fun testa(){
        println("Hello Siddharth")
    }
}
class B : A(){
    fun testb(){
        println("How are you?")
    }
}
class C:A(){
    fun testc(){
        println("good evening")
    }
}

fun main() {
    var a=C()
    a.testa()
    a.testc()
    var ab=B()
//    ab.testa()
    ab.testb()
}