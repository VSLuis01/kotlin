package OrientacaoObjetos

interface Selvagem {
    fun atacar() {
        print("atacaaarr")
    }

    fun furtivivar()
}

abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("Acordei")
    }

    fun dormir() {
        println("ZzzZz")
    }

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome), Selvagem {
    override fun falar() {
        println("AU AU")
    }

    override fun furtivivar() {
        println("Furtivivando")
    }
}

fun main() {

}
