package fluxo

fun bonus(cargo: String): Float {
    return if (cargo == "Gerente") {
        2000f
    } else if (cargo == "Coordenador") {
        1500f
    } else if (cargo == "Engenheiro de Software") {
        1000f
    } else if (cargo == "Estagiario") {
        500f
    } else {
        0f
    }
}

fun bonus2(cargo: String, exp: Int): Float {
    if (cargo == "Gerente") {
        return if (exp < 2) {
            2000f
        } else {
            3000f
        }
    } else if (cargo == "Coordenador") {
        return if (exp < 1) {
            1500f
        } else {
            1800f
        }
    } else if (cargo == "Engenheiro de Software") {
        return 1000f
    } else if (cargo == "Estagiario") {
        return 500f
    } else {
        return 0f
    }
}

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}

fun bonusWhen2(cargo: String, exp: Int): Float {
    return when (cargo) {
        "Gerente" -> if (exp < 2) 2000f else 3000f
        "Coordenador" -> if (exp < 1) 1500f else 1800f
        "Engenheiro de Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}

fun main() {
    /* CALCULAR BONUS DOS FUNCIONARIOS NO FINAL DO ANO
    * Gerente: 2000
    * Coordenadores: 1500
    * Eng. Software: 1000
    * Estagiario: 500*/

    println(bonus("Gerente"))
    println(bonus2("Gerente", 3))
    println(bonusWhen("Gerente"))
    println(bonusWhen2("Gerente", 3))
}