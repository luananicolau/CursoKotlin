package main.kotlin.selection

fun main(){

    println(">")
    val age = readln().toInt()

    if (age >= 0 && age <= 12){
        println("Criança")
    }else if (age >=13 && age <=17){
        println("adolescente")
    }else if (age >= 18 && age <= 65){
        println("adulto")
    }else if (age >= 66 && age <= 120){
        println("sênior")
    }else {
        println("Idade Inválida")
    }
}