package selection

fun main(){

    val x = 0

    val s = when {
        x > 0 -> "Positivo"
        x < 0 -> "negativo"
        else -> println("zero")
    }
    println(s)
}