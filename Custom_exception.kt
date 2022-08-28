class Myexception(message:String):Exception(message)

class Agevalidator{
    fun validate(age:Int){
        if(age>=18){
            println("Eligible for vote")
        }
        else{
            try {
                throw Myexception("Not ELigible")
            }catch (e:Myexception){
                println(e.message)
            }
        }
    }
}



fun main() {
    var v1=Agevalidator()
    v1.validate(12)

}