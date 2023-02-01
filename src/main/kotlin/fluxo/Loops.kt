package fluxo

fun main() {
    for (i in 1..20 step 2) {
        print("$i ")
    }

    val str = "Kotlin é show!\n"

    for (c in str) {
        print("$c")
    }
    print("\n")

    for (j in 20 downTo 0 step 5) {
        print("$j ")
    }
    print("\n")

    var i = 0
    while (i < 100) {
        print("$i ")
        i++
    }
    print("\n")

    var j = 0

    do {
        print("${j++} ")
    } while (j < 10)

    print("\n")

    while (true) {
        print("Digite um número: ")
        val line = readLine()
        if (line != null && line != "") {
            println(line)
            break
        }
    }
}