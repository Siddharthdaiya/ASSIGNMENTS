class student{


    var Id=0
    var name=""
    var course=""
    var email=""
    var age=0
    constructor(){
        println("constructor called")
    }
    constructor(Id:Int,name:String,course:String,email:String,age:Int){
        this.Id=Id
        this.name=name
        this.course=course
        this.email=email
        this.age=age
    }
    constructor(Id:Int,name:String,email:String,age:Int){
        this.Id=Id
        this.name=name
        this.course=course
        this.email=email
        this.age=age
    }
    fun setData(Id:Int,name:String,course:String,email:String,age:Int){
        this.Id =Id
        this.name =name
        this.email = email
        this.course = course
        this.age = age

    } fun print()
    {
        println("""
            Id = $Id
            name = $name
            email = $email 
            course = $course
        """.trimIndent())
    }
}



fun main() {
   var s1=student()
    s1.Id=1
    s1.name="Siddharth daiya"
    s1.course="java"
    s1.email="sid.daiya1230@gmail.com"
    s1.age=19

    s1.print()

 var s2=student()
    s2.setData(2,"Meet","dart,","meet@gmail.com",20)
    s2.print()

    var s3 = student(3, "Vikash", "vikash@gmail.com", "python", 29)
    s3.print()

}