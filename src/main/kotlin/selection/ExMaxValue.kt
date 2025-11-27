package main.kotlin.selection

fun main(){

    println(">")
    var v = readln().toInt()

    if (v > 10){
        v = 10
    }

    v *= v
    println(v)
}