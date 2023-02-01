package funcoes

fun main() {
    val str = "Programação Kotlin"

    println("Tamanho da str é: ${str.length}")

    println("Posição 0 da string é: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))



    println(str.substring(2, 4))
    println(str.replace("Kotlin", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())

    println("       meu nome é adasdas         ".trim())
}