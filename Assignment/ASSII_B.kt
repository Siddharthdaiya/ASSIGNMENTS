fun main() {
var year=2021
    if(year%400==0){
        println("the year is a leap year")
    }
    else if(year%100==0){
        println("The year is not a leap year")
    }
    else if(year%4==0){
        println("THe year is a leap year")
    }
    else
    {
        println("the year is not a leap year")
    }
}