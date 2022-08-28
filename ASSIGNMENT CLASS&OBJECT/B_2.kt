package `ASSIGNMENT CLASS&OBJECT`

data class Data(val name:String,val age:Int)

fun sendData():Data{
    return Data("harshil",18)
}

fun main(){
    val obj = sendData()

    println("Name is ${obj.name}")
    println("Age is ${obj.age}")


}
