package OrientacaoObjetos
class Receita {
    // Só pode ser var, e não é alocado na memória
    lateinit var instrucoes: String

    fun geraReceita() {
        instrucoes = "Lave as mãos"
    }

    fun imprimeReceita() {
        if (!this::instrucoes.isInitialized) {
            instrucoes = "Instruções não foram inicializadas"
        }
    }
}

fun main() {
    var receita = Receita()
    receita.imprimeReceita()
    receita.geraReceita()

    println(receita.instrucoes)
}
