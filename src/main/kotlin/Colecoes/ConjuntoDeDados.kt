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

data class ReceitaNIngrediente(val nome: String, val nIngrediente: Int)

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


    // take & takeLast
    println(data.take(2))
    println(data.takeLast(2))

    // foreach
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // max & min
//    println(data.maxOf { it.calorias})
//    println(data.minOf { it.calorias})

    listOf(1, 2, 8, 4).maxOf { it }
    listOf(1, 2, 8, 4).maxOrNull()

    println(data.maxByOrNull { it.calorias }) // Retorna o objeto
    println(data.maxOf { it.calorias }) // Retorna o valor

    // map

    println(data.map { it.nome }) // map é usado para transformar uma coleção em outra
    println(data.map { ReceitaNIngrediente(it.nome, it.ingredientes.count()) })

}