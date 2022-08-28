fun main() {
    val numberlist:MutableList<Int> = mutableListOf(1,2,3)


    numberlist.also {
        println("THE LIST ELEMENTS ARE $it")
        it.add(4)
        println("THE ELEMENTS AFTER ADDING ONE ELEMENT IS $it")

        it.removeAt(2)
        println("THE EMLEMENET AFTER REMOVING THE INDEX 2 IS $it"
        )
    }

}