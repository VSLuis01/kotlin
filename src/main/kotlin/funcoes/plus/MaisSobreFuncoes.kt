package funcoes.plus

/*Valores padrao*/
fun endereco(rua: String, cidade: String, estado: String, cep: String = "", numero: Int = 0) {
}

fun media(vararg notas: Double) {
    var total = 0.0
    for (nota in notas) {
        total += nota
    }
    println(total / notas.size)
}
fun main() {
    endereco("Rua 1", "São Paulo", "SP", "12345-678")
    endereco(estado = "estado", cidade = "cidade", rua = "rua", numero = 30)

    try {
        media(7.0, 8.0, 9.0)
        media()
    } catch (e: ArithmeticException) {
        println("Erro: ${e.message}")
    }
}