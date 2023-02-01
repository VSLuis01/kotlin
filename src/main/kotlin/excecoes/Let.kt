package excecoes

fun main() {
    val str: String? = null

    // Só é executado se str não for nulo
    str?.let {
        it.lowercase()
        println(it)
    }
}