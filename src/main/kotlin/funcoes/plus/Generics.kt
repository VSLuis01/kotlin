package funcoes.plus

fun <T, J> media(abc: J, vararg notas: T): Float {
    var total = 0.0f
    for (nota in notas) {
        if (nota is Float) {
            total += nota
        }
    }
    return (total / notas.size)
}
fun main() {
    println(media(false, 10f, 9f, "", false, 10f))

    arrayOf(1, 2, 3, 4, 5, false, "ai").forEach {
        println(it)
    }
}