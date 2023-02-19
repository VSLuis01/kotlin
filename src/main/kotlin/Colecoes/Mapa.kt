package Colecoes

fun main() {
    //Chave->Valor

    val map1 = mapOf<String, String>(
        Pair("França", "Paris"),
        Pair("Espanha", "Madrid"),
        Pair("Portugal", "Lisboa")
    )

    println(map1)
    println(map1.entries)
    println(map1.values)
    println(map1.keys)

    val map2 = mutableMapOf<String, String>(
        Pair("França", "Paris"),
        Pair("Espanha", "Madrid"),
        Pair("Portugal", "Lisboa")
    )
    map2["Brasil"] = "Brasília"
    println(map2)
    map2.remove("França")
    println(map2.contains("Brasil"))
    map2.clear()

}