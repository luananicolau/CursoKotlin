package repetition

fun main(){

   print(">")
    val n = readln().toInt()
    val m = 10

    for( x in 1 .. m){
        println("$n x $x = ${n * x}")
    }

}