package portaria.control

import portaria.business.ConvidadoBusiness
import portaria.entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria iniciada! ")
        println(this.controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Digite a idade: ")
        val convidado = Convidado(idade = idade)
        if (!convidadoBusiness.maiorDeIdade(convidado.idade)) {
            return "Negado. Menores de 18 anos não podem entrar."

        }

        convidado.tipo = Console.readString("Qual é o tipo de convite: ")
        if(!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Negado. Convite inválido."
        }

        convidado.codigo = Console.readString("Qual é o código do convite: ")
        if(!convidadoBusiness.convidadoValido(convidado)) {
            return "Negado. Convite inválido."
        }

        return "Welcome!"
    }
}