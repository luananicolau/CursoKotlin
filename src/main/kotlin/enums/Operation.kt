package enums

fun main(){
    println(Operation.PLUS.apply(40,30))

}

enum class Operation{
    PLUS{
        override fun apply(n1: Int, n2: Int): Int {
            TODO("Not yet implemented")
        }
    },
    MINUS{
        override fun apply(n1: Int, n2: Int): Int {
            TODO("Not yet implemented")
        }
    };
    abstract fun apply(n1:Int, n2: Int): Int
}