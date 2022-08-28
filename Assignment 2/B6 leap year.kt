package `Assignment 2`

fun main() {


        println("enter the year")
        var year = readLine()!!.toInt()

        if (year%400==0){
            println("this year is leap year")
        }
        else if (year%100==0){
            println("this year is leap year")
        }
        else{
            println("this year is not leap year")
        }
    }
