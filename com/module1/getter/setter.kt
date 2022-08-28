class Tutor{
    var name=""
    get()=field
    set(value) {
        field=value
    }
}

fun main() {
    var t1=Tutor()
    t1.name="siddharth daiya"
    println("${t1.name}")
}