package funtions

fun main(){

    println(
        calculateDogAge(
            (readln().toDouble()))
    )
}

private fun calculateDogAge(age: Double): Double{
    return age * 7
}