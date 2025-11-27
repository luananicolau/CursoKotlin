package funtions

fun main(){
    sayHello(message = "Tudo bem?")
}

private fun sayHello(name: String = "Desconhecido, message: String"){
    println("Hi, $name! $message")
}