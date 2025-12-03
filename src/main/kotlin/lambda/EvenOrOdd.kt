package lambda

fun main(){

    val f: (Int) -> Boolean = {n: Int -> n % 2 == 0}
    val f2 = {n: Int -> n % 2 == 0}
}