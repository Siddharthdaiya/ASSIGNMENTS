package `Assignment 2`

fun main() {

    var name = "harshil patoliya "
    var vowel = 0
    var consonant = 0

    for (i in 0..name.length-1){
        var ch = name[i]
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
            vowel++
        }
        else{
            consonant++
        }
    }
    println("vowel : $vowel")
    println("constant : $consonant")

}