class person1{
    var name:String=""
    var age:Int=0
}

fun main() {
    var person1=person1().apply{
        name="SIDDHARTH"
        age=20
    }
with (person1){

    println(name)
    println(age)
}
}