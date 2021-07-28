package estudos.collections.kotlin

fun main() {
    val joao = Funcionario("João", 15000.0, "PJ")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val guilherme = Funcionario("Guilherme", 30000.0, "CLT")

    val funcionarios = listOf(joao, pedro, guilherme) // mais simples que os arrays, nesse caso
    funcionarios.forEach{println(it)} // por que não utiliza .toString?

    println("---------------")
    println(funcionarios.find { it.nome == "Guilherme" })

    println("---------------")
    funcionarios
        .sortedBy { it.salario } // ordenamos e depois imprimimos os valores
        .forEach { println(it) }

    println("---------------")
    funcionarios
        .groupBy { it.contrato }
        .forEach{println(it)}
}

// criando classe funcionários
data class Funcionario(
    val nome: String,
    val salario: Double,
    val contrato: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: R$ $salario
            Contrato: $contrato
        """.trimIndent()
}