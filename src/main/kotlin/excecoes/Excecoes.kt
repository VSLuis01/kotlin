package excecoes

import java.lang.Exception

fun main() {

    try {
        val s: String? = null
        println(s!!.length)

        val a = 10 / 0
    } catch (e: NullPointerException) {
        println("Variável nula")
    } catch (e: ArithmeticException) {
        println("Divisão por zero")
    } catch (e: Exception) {
        println("Generico")
    } finally {
        println("Fim do bloco try")
    }

    print("Fim do programa")
}