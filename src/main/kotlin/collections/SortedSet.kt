package collections

fun main() {
    val s = sortedSetOf(Comparator.naturalOrder(), 1, 3, 5, 7 , 4, 6)
    println(s)

    val dogs = sortedSetOf(
        Comparator.comparing { d: Dog -> d.name }.reversed(),
        Dog("venus"),
        Dog("ully"),
        Dog("pinape"),
    )
    println(dogs)
}