class test() {
    fun add(num1: Int, num2: Int) {
        println("Addition:${num1 + num2}")
    }

    fun add(num1: Float, num2: Int) {
        println("Addition:${num1 + num2}")
    }

    fun add(num1: Int, num2: Int, num3: Int) {
        println("Addition:${num1 + num2+num3}")
    }

}
    fun main() {

    var t1=test()
        t1.add(55,20,40)
}