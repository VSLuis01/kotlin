package Colecoes

fun main( ) {
    val lst1: List<Int> = listOf(1, 2, 3, 4, 5)
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(lst2[0])
    println(lst2.size)

    lst2.add(0)
    lst2.add(19)
    lst2.remove(4)
    lst2.removeAt(0)

    println(lst2.contains(1))
    lst2.clear()

    println(lst2)
}