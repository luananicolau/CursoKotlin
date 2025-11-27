package variables

fun main(){

    val s1 = "abc"
    val s2 = "def"

  //  val s1s2 = s1 + s2
    val s1s2 = "soma: $s1$s2. O tamanho é: ${(s1 + s2)}"

    println(s1s2)


}