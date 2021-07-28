package estudos.collections.kotlin

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0) // para cada string tenho meu double associado
    val map1 = mapOf(pair) // o conjunto de pairs fica alocado em um mapa chave-valor

    map1.forEach { (k, v) -> println("Chave $k - Valor: $v") } // os parenteses deixam explicito  o pair, necessário

    println("---------------------------------")

    val map2 = mapOf(
        "Pedro" to 2500.00,
        "Maria" to 3000.00) // uso o "to" para ligar uma coisa na outra, in fix**

    map2.forEach { (k, v) -> println("Chave $k - Valor: $v") }
}