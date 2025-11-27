package main.kotlin.selection

fun main(){

    print(">")
    val x = readln().toInt()

    val type : String
    if (x % 2  == 0) {
        type = "PAR"
    } else {
        type = "Impar"
    }
    println(type)

}