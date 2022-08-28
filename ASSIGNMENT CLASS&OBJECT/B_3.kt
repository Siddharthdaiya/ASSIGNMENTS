package `ASSIGNMENT CLASS&OBJECT`

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val jack = User("harshil", 18)
    println("name = ${jack.name}")
    println("age = ${jack.age}")
}