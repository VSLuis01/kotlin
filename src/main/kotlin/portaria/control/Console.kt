package portaria.control

class Console private constructor() {

    companion object {
        fun readInt(msg: String): Int {
            var retorno: Int? = null
            do {
                print(msg)
                val info = readLine()

                if (info != null) {
                    retorno = info.toIntOrNull()

                    if (retorno == null || retorno <= 0) {
                        println("Valor inválido!")
                    }
                }
            } while (retorno == null || retorno <= 0)

            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String? = null
            do {
                print(msg)
                val info = readLine()

                if (info != null) {
                    retorno = info

                    if (retorno.isEmpty()) {
                        println("Valor inválido!")
                    }
                }
            } while (retorno.isNullOrEmpty())

            return retorno.lowercase()
        }
    }
}