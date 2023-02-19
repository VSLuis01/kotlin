package Colecoes

fun main() {

    // Set é uma coleção que não permite elementos repetidos
    // e não possui ordem definida
    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf<String>()

    set2.add("Paris")
    set2.remove("Paris")
    set2.contains("Paris")

    set2.clear()
    println(set1)
}