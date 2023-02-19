package portaria.business

import portaria.entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo: String): Boolean = tipo == "luxo" || tipo == "comum" || tipo == "premium"

    private fun convidadoValido(codigo: String, tipo: String): Boolean = when (tipo) {
        "comum" -> codigo.startsWith("xt")
        "premium", "luxo" -> codigo.startsWith("xl")
        else -> false
    }

    fun convidadoValido(convidado: Convidado): Boolean = convidadoValido(convidado.codigo, convidado.tipo)

    fun maiorDeIdade(idade: Int): Boolean = idade >= 18

}