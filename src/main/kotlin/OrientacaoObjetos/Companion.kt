package OrientacaoObjetos

class Matematica {
    companion object {
        val PI = 3.1415

        fun teste() {

        }

        init {
            println("fui inicializado1")
        }
    }

    object obj1 {
        val PI = 3.1415

        fun teste() {

        }
    }

    object obj2 {
        val PI = 3.1415

        fun teste() {

        }

        init {
            println("fui inicializado2")
        }
    }
}

fun main () {
    Matematica.PI
    Matematica.PI
    Matematica.PI
    Matematica.PI


    Matematica.obj2.PI
    Matematica.obj2.PI
    Matematica.obj2.PI
    Matematica.obj2.PI
}