package estudos.collections.kotlin

fun main() {
    val salarios = doubleArrayOf(1000.00, 2000.00, 3000.00, 4000.00)

    salarios.forEach { println(it) }

    println("-------------------------")

    println("Maior salário ${salarios.maxOrNull()}") // não o max já está depreciado nessa versão
    println("Menor salário ${salarios.minOrNull()}") // ou tira o menor, ou retorna null
    println("Salário médio ${salarios.average()}")

    println("-------------------------")

    val maior2500 = salarios.filter { it > 2500 } // só passa valores acima de 2500
    maior2500.forEach{println(it)}

    println("-------------------------")
    println(salarios.count{it in 2000.0..5000.0}) // conta apenas entre 2k e 5k, retorna 3
    println(salarios.find{it == 4000.0})
    println(salarios.find{it == 400.0}) // não existe, vai retornar null
    println(salarios.any{it == 1000.0}) // existe esse valor no meu array? retorna true/false


}