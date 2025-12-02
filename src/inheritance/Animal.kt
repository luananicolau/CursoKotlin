package inheritance

abstract class Animal(
    val color: String
){
    fun eat(){
        println("Eating")
    }
    private fun sleep(){
        println("Sleeping")
    }
}

class Dog(color: String) : Animal(color){
    fun bark(){
        println("AuAu")
    }
}

class Cat(color: String): Animal(color){
    fun miau(){
        println("Miau")
    }
}
