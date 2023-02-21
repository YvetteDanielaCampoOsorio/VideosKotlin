// Ejercicio:Algoritmo que solicite la edad de una persona, si la edad es menor a 18 indique que la persona es menor de edad, de lo contrario indique que es mayor de edad

fun main () {
    println("Ingrese su edad:")
    var edad = readLine()!!.toInt()
    
    if ( edad < 18) {
        println("es menor de edad")
    } else{
        println("es mayor de edad")
    }

println("la edad es : $edad")
}