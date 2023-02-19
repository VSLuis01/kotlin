package Colecoes

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)

fun gerarDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

fun main() {
    val data = gerarDados()

    // Verifica se existe algum elemento na coleção
    println("Tem dados? ${if (data.any()) "Sim" else "Não"}")
    println("Tem ${data.count()} receitas")

    println("Primeira receita: ${data.first().nome}")
    println("Última receita: ${data.last().nome}")

    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())

    // sum & sumOf
    println(listOf(1, 2, 3, 4, 5).sum())

    println(data.sumOf { it.calorias })

    // filter
    println(data.filter { it.calorias > 500 })
    println(data.count { it.calorias > 500 })
}