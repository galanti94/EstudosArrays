package estudos.collections.kotlin

fun main() {
    val joao = Funcionario("João", 15000.0, "PJ")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val guilherme = Funcionario("Guilherme", 30000.0, "CLT")

    val funcionario1 = setOf(joao, pedro)
    val funcionario2 = setOf(pedro, guilherme)

    val uniaoFuncionario = funcionario1.union(funcionario2) // só pega os diferentes, não repete, não é lista
    uniaoFuncionario.forEach { println(it) }

    println("-----------------------")
    val subtracaoFuncionario = funcionario1.subtract(funcionario2) // remove do 1 o que tem no 2
    subtracaoFuncionario.forEach { println(it) }

    // tem o instersect também, mas nem vou fazer kakaka
}