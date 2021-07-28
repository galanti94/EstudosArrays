package estudos.collections.kotlin

fun main(){
    val nomes = Array(3){""} // muito verbosa

    nomes[0] = "Guilherme"
    nomes[1] = "João"
    nomes[2] = "Maria"

    nomes.forEach { println(it) }

    println("--------------------------")

    val nomes2 = arrayOf("Zaza", "Pedro", "João")
    nomes2.forEach { println(it) }
}