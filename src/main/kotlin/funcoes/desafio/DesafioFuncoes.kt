package funcoes.desafio

fun main() {
    val ano = 2

    println("$ano equivalem a:")
    println("${yearsToMonths(ano)} meses")
    println("${yearsToDays(ano)} dias")
    println("${yearsToHours(ano)} horas")
    println("${yearsToMinutes(ano)} minutos")
    println("${yearsToSeconds(ano)} segundos")
    println(countOfChars("Programação Kotlin"))
    println(cubeNumber(2))
    println(milesToKm(2))
    println(replaceAtoX("Está é uma string pArA testar essa função"))
}

fun yearsToMonths(years: Int): Int = years * 12
fun yearsToDays(years: Int): Int = years * 365
fun yearsToHours(years: Int): Int = yearsToDays(years) * 24
fun yearsToMinutes(years: Int): Int = yearsToHours(years) * 60
fun yearsToSeconds(years: Int): Int = yearsToMinutes(years) * 60
fun countOfChars(str: String): Int = str.length
fun cubeNumber(num: Int): Int = num * num * num
fun milesToKm(miles: Int): Float = miles * 1.6f
fun replaceAtoX(str: String): String = str.replace("a", "x", true)
