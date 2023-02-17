package OrientacaoObjetos

interface Event {
    fun onSucess()
}

class Programa {
    fun salvar(e : Event) {
        println("Salvando evento")

        e.onSucess()
    }
}

fun main() {
    val p = Programa()

    p.salvar(object : Event {
        override fun onSucess() {
            println("Salvo com sucesso")
        }
    })
}