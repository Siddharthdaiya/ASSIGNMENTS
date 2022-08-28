package `Assignment 2`

fun main() {


        println("enter the number :-")
        var num = readLine()!!.toInt()

        when{
            num>0 -> println("$num number is positive")
            num<0 -> println("$num number is negative")
            else -> println("$num is 0")
        }

    }
