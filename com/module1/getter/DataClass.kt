data class User(

        var Id:Int,
        var name:String,
        var email:String,
        var course:String,
        var age:Int

)

class Student(
        var Id:Int,
        var name:String,
        var email:String,
        var course:String,
        var age:Int
)
{
    init {
        println("""
            Id:$Id
            name:$name
            email:$email
            course:$course
            age:$age
        """.trimIndent())
    }
   companion object{

    // static member
    var collegeName = "Tops Technologies"

    // static function
    fun show(){
        println(collegeName)


    }

}


    override fun equals(other: Any?): Boolean {
        var obj=other as Student
        return this.Id == obj.Id && this.name == obj.name && this.email == obj.email && this.course == obj.course
    }

    override fun toString(): String {
        return """Id:$Id
                 name:$name
                 age:$age""".trimMargin()
    }
}

fun main() {
    var s1=Student(1,"SIDDHARTH DAIYA","sid.daiya@gmail.com","Kotlin",19)
    var s2=Student(2,"BODHISATVA KAMBLE","bodhi@gmail.com","Java",20)
    var s3=Student(3,"MEET MANGUKIYA","meet@gmail.com","Dart",22)
    var s4=Student(3,"MEET MANGUKIYA","meet@gmail.com","Dart",22)
println(s2)
    println("equals : ${s3==s4}")

    var obj1=User(3,"MEET MANGUKIYA","meet@gmail.com","Dart",22)
    var obj2=User(3,"MEET MANGUKIYA","meet@gmail.com","Dart",22)
    var obj3=User(3,"MEET MANGUKIYA","meet@gmail.com","Dart",22)
    var obj4=User(3,"MEET MANGUKIYA","meet@gmail.com","Dart",22)

}