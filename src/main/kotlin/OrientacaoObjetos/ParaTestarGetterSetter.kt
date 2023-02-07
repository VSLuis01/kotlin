package OrientacaoObjetos

class Animal2(var especie: String) {
    var fala: String = ""
        get() {
            println("Acesso get")
            return field // field é o valor da variável fala
        }
        set(value) {
            println("Acesso set")
            field = value
        }
}

fun main() {
    var animal = Animal2("Cachorro")
    animal.fala = "Au au"
}