package OrientacaoObjetos

fun main() {
    val f1: Forma = Forma(10, 8)
    val f2: Forma = Forma(10, 8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("---------------")
    println(f2.toString())
    println(f2.hashCode())

    println("---------DATA CLASS----------")

    val fd1 = FormaData(10, 8)
    val fd2 = FormaData(10, 8)

    println(fd1.equals(fd2))
    println(fd1.toString())
    println(fd1.hashCode())
    println("---------------")
    println(fd2.toString())
    println(fd2.hashCode())

    val f3: FormaData = fd1.copy(a=50, b=10)
    println(f3)
}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Forma) {
            return other.a == this.a && other.b == this.b
        }
        return false
    }

    override fun toString(): String {
        return "Forma(a=$a, b=$b)"
    }
}

// O data class já implementa equals, toString e hashCode
// É utilizado para representar dados
data class FormaData(val a: Int, val b: Int)