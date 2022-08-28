fun main() {
    try {
        var array = arrayOf("Viral", "Janvi", "Siddarth", "Varnika")
        println("element at index 2 = ${array[8]}")

        var number = "123es"
        println(number.toInt() + 10)

        var str: String? = null
        println("length : ${str!!.length}")
    }
    catch (e:java.lang.Exception)
    {
        println(e.message)
        println(e.javaClass)
        println("EXCEPTION HANDLED")
    }finally {
        println("ALL CODE EXCECUTED")
    }
}