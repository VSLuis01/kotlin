package OrientacaoObjetos

abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("Acordei")
    }

    fun dormir() {
        println("ZzzZz")
    }

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("AU AU")
    }
}

fun main() {

}
