package excecoes

fun main() {
    val str: String? = null

    /*
    if (str == null) {
        println("str é nulo")
    } else {
        println(str)
    }
     */

    // Elvis operator
    println(str ?: "str é nulo")
}