package exceptions

fun main() {
    val account = BankAccount()

    try {
        account.deposit(400.0)
        account.withdraw(500.0)
    } catch (e: InvalidValueException) {
        println("Erro: ${e.message}")
    } finally {
        println((account.balance)) // SEMPRE será executado
    }

}

class BankAccount() {
    var balance: Double = 0.0
        private set

    fun deposit(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }
        balance += value
    }

    fun withdraw(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }
        if (balance - value < 0) {
            throw InsufficientFundsException(balance)
        }
        balance -= value
    }
}