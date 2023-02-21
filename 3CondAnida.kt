// Ejercico: Haga un algoritmo que solicite el ingreso de 2 números, valide cual es mayor o si son iguales

fun main () {
    println("Ingrese el numero uno:")
    var a = readLine()!!.toDouble()
    
    println("Ingrese el numero dos:")
    var b = readLine()!!.toDouble()

    if ( b > a) {
        println("$b es mayor a $a")
    } else{
        if ( a > b ) {
        println("$a es mayor a $b")
    }else{
        println("$a es igual a $b")
    }
}}