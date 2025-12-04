package collectionlambda

fun main() {

//mais simples:

    val count = Person
        .data()
        .count { it.name.uppercase().startsWith("R") }

    println(count)
}