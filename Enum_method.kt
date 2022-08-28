enum class Rainbow{
    orange,blue,red, green,violet,indigo,yellow
}

fun main() {
    var colours=Rainbow.blue
println("value of the colours is : ${colours.name}")
    when(colours){
        Rainbow.red->println("RED COLOUR")
        Rainbow.blue->println("BLUE COLOUR")
        Rainbow.orange->println("ORANGE COLOUR")
        Rainbow.green->println("GREEN COLOUR")
        Rainbow.violet->println("VIOLET COLOUR")
        Rainbow.indigo->println("INDIGO COLOUR")
        Rainbow.yellow->println("YELLOW COLOUR")
    }
}