import kotlin.random.Random

fun main() {
    val valores = IntArray(5) // precisa alocar memória, muito travado

    for(i in 0..4) valores[i] = Random.nextInt(0,100)

    valores.forEach { println(it) }
}