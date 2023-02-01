package fluxo

fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de idade")

        if (idade > 60) {
            println("Terceira idade")
        }
    } else if (idade < 10) {
        println("Criança")
    } else {
        println("Menor de idade")
    }
}

/**
 * If que retorna um valor
 */
fun saudacao(dia: Boolean): String = if (dia) {
    "Bom dia"
} else {
    "Boa noite"
}

fun main() {
    maiorDeIdade(18)
    maiorDeIdade(15)
}