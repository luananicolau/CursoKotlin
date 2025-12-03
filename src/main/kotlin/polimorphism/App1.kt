package polimorphism

fun main(){

    val c = Coffee()
    c.prepare()
}

open class Drink {

    fun prepare(){
        println("Prepare DRINK")
    }
}

class Coffee : Drink()
