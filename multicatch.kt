fun main() {
    try {
        var array = arrayOf("Viral", "Janvi", "Siddarth", "Varnika")
        println("element at index 2 = ${array[8]}")

        var number = "123es"
        println(number.toInt() + 10)

        var str: String? = null
        println("length : ${str!!.length}")

        println(45/0)
    }
    catch (e:ArrayIndexOutOfBoundsException){
        println("array of index out bound handled")
    }

    catch (e:NullPointerException){
        println("NUll pointer exception  handled")
    }catch (e:java.lang.NumberFormatException){
        println("number format exception handled")
    }
    catch (e:ArithmeticException){
        println("Arithmetic exception handled")
    }
}