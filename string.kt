fun main() {


    var name="tops tech"
    for(ch in name)
    {
        print("${ch}\t")
    }
    println("length : ${name.length}")



    var str1="TOPS"
    var str2="TOPS"
println("equals:${str1==str2}")
    if(str1==str2)
        println("both are equals")
    else
      println("both are not equals")

    var str3="ABC"
    var str4="abc"
    println("ignore case : ${str3.equals(str4, ignoreCase = true)}")
//
//    var s1 = "       Welcome to tops tech       "
//    println("length : ${s1.trim().length}" )
    var s1="      welcome to tops techjnologies      "
    println("lenght: ${s1.trim().length}")


    println("char at index-5 : ${name[5]}")

    var s2 = "Hello guys.. good afternoon.."

    // contains
    println("contains : ${s2.contains("good")}")

    // replace
    var s3 = s2.replace("afternoon", "evening")
    println(s3)

    // split
    var s4 = "abc/cbe/efg/hij"

    println(s4.split("/"))

    // sub string

    var s5 = "Tops Technologies"

    println("substring : ${s5.substring(2..5)}")

}
