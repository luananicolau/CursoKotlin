package classes

fun main() {
    val a1 = Account("1234-1", "Luana")
    val a2 = Account("3456-1", "Guilherme")

    a1.balance = 100.0
    a2.balance = 1_000_000.0

    println(a1.balance)
    println(a2.balance)
}
