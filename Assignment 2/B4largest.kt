package `Assignment 2`

fun main() {

        println("enter the value of a :-")
        var a = readLine()!!.toInt()

        println("enter the value of a :-")
        var b = readLine()!!.toInt()

        println("enter the value of a :-")
        var c = readLine()!!.toInt()

        if(a>b){
            if(a>c){
                println("a is greater");
            }
            else{
                println("c is greater");
            }
        }
        else{
            if(b>c){
                println("b is greater");
            }
            else{
                println("c is greater");
            }
        }
    }
