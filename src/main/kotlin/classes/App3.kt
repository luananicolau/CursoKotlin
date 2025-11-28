package classes

fun main() {

    val a1 = Account("1234-1", "Luana")
    val a2 = Account("3456-1", "Guilherme")
    val a3 = Account()
    val a4 = Account("8888-7", "Raissa", 1000.0)

    a1.deposit(10.0)
    a2.deposit(50.0)
    a4.deposit(2000)

    a1.print()
    a2.print()
    a3.print()
}
