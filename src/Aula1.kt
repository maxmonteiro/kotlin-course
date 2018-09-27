// LISTAS
fun main(args: Array<String>) {
    var list: List<String> = listOf()

    list += "American 1"
    list += "American 11"
    list += "American 111"
    list += "American 2"

    val newList = list.asSequence() // converte a lista como sequence
            .mapIndexed { index, kind ->
                if (kind.contains( "American 1")) {
                    "American 666"
                } else {
                    kind
                }
            }.toList() // converte a sequence em lista novamente

    val listAmericans2 = list.filter { it.contains("2") }

    val listAmericans3 = list.filter { it.contains("A") && it.contains("1") } // operadores que podem ser usados &&(e) e ||(ou)

    list.map { println(it) } // quando tem um parametro pode-se usar it
    println("\n")
    newList.map { println(it) }
    println("\n")
    listAmericans2.map { println(it) }
    println("\n")
    listAmericans3.map { println(it) }
}