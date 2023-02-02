package AnyUnitNothing


fun valores(value: Any) { }

fun unit(): Unit {
    println("Unit")
}

fun nothing(): Nothing {
    TODO("Não implementado")
}

fun main() {
    //Any, é a superclasse de todas as classes
    valores("")
    valores(1)
    valores(true)

    //Unit é o tipo de retorno de uma função que não retorna nada
    unit()

    //Nothing é o tipo de retorno de uma função que não retorna nada e nunca termina
    nothing()

}