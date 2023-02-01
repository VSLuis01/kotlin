package funcoes

fun main() {
    helloWord()


    println("A SOMA DE 2 E 2 É: ${sum(2, 2)}")
    println("DIVSAO DE 2 E 2 É: ${div(2f, 2f)}")
}

/**
 * FUNÇAO DE UNICA LINHA
 */

fun sum2(a: Int, b: Int) = a + b

fun sum(a: Int, b: Int): Int {
    return a + b
}

/*
    Unit é o retorno padrão de uma função
 */
fun helloWord(): Unit {
    println("Hello, world!")
}

fun helloWorld2() = println("Hello, world!")

fun div(a: Float, b: Float) = a / b