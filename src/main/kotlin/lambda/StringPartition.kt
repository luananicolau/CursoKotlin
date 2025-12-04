package lambda

fun main(){

    val s = "ajsksanask"

    val partitions = s.partition { it.isUpperCase() }

    println("First: "+ partitions.first)
    println("Second: "+ partitions.second)

}