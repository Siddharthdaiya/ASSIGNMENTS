class person{
    var name="SIDDHARTH"
    var age=25
}
fun main() {
val person=person()
    println(person.name)
    println(person.age)


   val ageAfterFiveTears:Int= with(person){
        println(name)
        println(age)
       age+7
    }

    println("AGE Aftyer five years is $ageAfterFiveTears")
}