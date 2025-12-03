package polimorphism

fun main(){

    val p = Programmer()
    p.work()

    val t = Teacher()
    t.work()
}

abstract class Employee{
    abstract fun work()
}

class Programmer : Employee(){

    override fun work() {
        println("programmer working...")

    }


}
class Teacher : Employee(){

    override fun work() {
        println("teacher working...")
    }

}