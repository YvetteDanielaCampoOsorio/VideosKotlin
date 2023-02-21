// Ejercicio: Haga un algoritmo que calcule el valor absoluto de un numero
// El valor absoluto es el valor de x sin considerar el signo, sea este positivo o negativo.

fun main () {
    println("ingrese el numero")
    var numero = readLine()!!.toInt()

    if ( numero < 0 ) {
        numero *= -1
    }
    println("el valor absoluto es: $numero")
}
