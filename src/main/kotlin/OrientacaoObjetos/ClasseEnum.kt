package OrientacaoObjetos

enum class Prioridade(val value: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Prioridade baixa $value"
        }
    },
    MEDIA(5) {
        override fun toString(): String {
            return "Prioridade média $value"
        }
    },
    ALTA(15) {
        override fun toString(): String {
            return "Prioridade alta $value"
        }
    }
}

enum class AnimalEnum {
    CACHORRO, GATO, CAVALO, PAPAGAIO
}

enum class TipoConvite {
    SIMPLES, VIP
}

fun portaria(tipoConvite: TipoConvite) {
    println(tipoConvite)
}

fun main() {
    portaria(TipoConvite.SIMPLES)

    for (p in Prioridade.values()) {
        println(p)
    }
}