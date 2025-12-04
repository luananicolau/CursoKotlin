package lambda

import java.util.concurrent.locks.Condition

fun main(){
    val x = 3

    runIfTrue(x > 5){
        println("Code executed!")
    }
    println("Code executed")
}

fun runIfTrue(condition: Boolean, code: () -> Any?): Any? {
    if (condition) {
        code()
    } else {
        null
    }
    return TODO("Provide the return value")
}