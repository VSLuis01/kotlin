package OrientacaoObjetos
class Pessoa(val anoNascimentos: Int, var nome: String) {
    var doc: String = ""

    constructor(anoNascimentos: Int, nome: String, doc: String): this(anoNascimentos, nome) {
        this.doc = doc
    }

    fun dormir() {

    }

    fun acordar() {}
}

/*Construtor privado. Não é possivel instanciar*/
class Vazia private constructor() {

}

fun main() {
    var pessoa: Pessoa = Pessoa(2000, "Fulano", "3123123123")
    var pessoa2: Pessoa = Pessoa(2000, "Fulano")

    pessoa.acordar()
    pessoa.dormir()
    pessoa.doc
}