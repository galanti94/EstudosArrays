package estudos.collections.kotlin

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 3221.33
    salarios[2] = 4231.32

    salarios.forEach { println(it) }

    println("-------------------------------")

    val aumento = 1.1
    salarios.forEachIndexed { index, salarioInicial ->
        salarios[index] = salarioInicial * aumento }

    salarios.forEach { println(it) }
}