package excecoes

fun main() {
    //Null safety
    var s: String? = null
    //logico

//    println(s?.length) //safe call, ou seja se for nulo vai dar null
//    println(s!!.length) //not null assertion, ou seja se for nulo vai dar erro

    val ab = readLine()
    println(ab!!.length)
}