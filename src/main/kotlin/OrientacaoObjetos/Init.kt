package OrientacaoObjetos

class Animal(var especie: String) {
    var fala: String = ""

    // É executado quando a classe é instanciada
    init {
        fala = if (especie == "cachorro") {
            "Au au"
        } else if (especie == "gato") {
            "Miau"
        } else {
            "Não sei falar"
        }
    }

    init {
        println("Init2")
    }

    fun falar() {
        println(fala)
    }
}

fun main() {
    Animal("cachorro").falar()

}