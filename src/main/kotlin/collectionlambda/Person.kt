
package collectionlambda

data class Person(val name: String, val age: Int) {

    companion object {
        fun data(): List<Person> {
            return listOf(
                Person("Guilherme" ,13),
                Person("LuanaMaravilhosa" ,19),
                Person("Kaio" ,32),
                Person("Sergio" ,40),
                Person("Wesley" ,69),
                Person("Lenci" ,23),
                Person("Helter" ,40),
                Person("Amaury" ,42),
                Person("Alicia" ,99),
            )
        }
    }
}