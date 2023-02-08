package OrientacaoObjetos

fun main() {
    val p = Pessoa(1990, "João")
    p.acordar()
    p.dormir()

    // O with serve para acessar os membros de um objeto sem precisar usar o ponto
    // É bom para reduzir a verbosidade do código
    with(p) {
        acordar()
        dormir()
        println(doc)
    }
}