
open class Car(
        var tyres:Int,
        var name :String,
        var model:String,
)
class Electricar(var etyres:Int, var ename:String, var  emodel:String,var consuming:String ,var rate:Int ) : Car(etyres,ename,emodel){

    fun showDetail(){
        println("tyres :$tyres name:$name model:$model consuming:$consuming rate :$rate")
    }
} // child class
class Petrolcar(var etyres:Int, var ename:String, var  emodel:String,var consuming:String ,var rate:Int ) : Car(etyres,ename,emodel) {

    fun showDetail() {
        println("tyres :$tyres name:$name model:$model consuming:$consuming rate :$rate")
    }
}

fun main()
{
    var e1=Electricar(4,"tesla","tesla2019","battery",7000000)
    e1.showDetail()
    var p1=Petrolcar(4,"audi","audiQ3","petrol",10000000)
    e1.showDetail()
}







