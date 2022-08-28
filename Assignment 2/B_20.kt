package `Assignment 2`

fun main() {


    var n=17
    for(i in 2..n){
        if(n%i==0){
            println("Number is non-prime");
            break
        }
        else{
            println("Number is prime");
            break
        }
    }
}
