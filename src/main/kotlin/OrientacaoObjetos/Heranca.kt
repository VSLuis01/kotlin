package OrientacaoObjetos

open class Eletronico(private var marca: String) {


    private fun ativarCorrente(s : String) {}

    fun ligar() {
        this.ativarCorrente("")
    }

    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoft() {

    }
    fun processar() {}
}

fun main() {
    var c = Computador("ACER")

    c.ligar()
    c.desligar()

//    c.marca

}