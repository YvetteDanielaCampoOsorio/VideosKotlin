//Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
// 1. Sumar
// 2. Restar
// 3. Multiplicar
// 4. Dividir
// 5. Finalizar
// Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4

fun main () {
    var opcion : Int
    var num1 : Float
    var num2 : Float
    
    do {
     println("Ingrese el numero 1:")
     num1 = readLine()!!.toFloat()    
    println("Ingrese el numero 2:")
     num2 = readLine()!!.toFloat()    
    println("Ingrese una opcion : \n 1. Sumar \n2.Restar \n3.Multiplicar \n4.Dividir \n5.Finalizar")
    opcion = readLine()!!.toInt()
    
        when (opcion) {
            1 -> println("La sumas es: ${ num1 + num2}")
            2 -> println("La resta es: ${ num1 - num2}")
            3 -> println("La multiplicacion es: ${ num1 * num2}")
            4 ->{ 
            if (num2 <= 0){
                println("El segundo numeo no puedes ser negativo o 0")    
            }else{
                println("La sumas es: ${ num1 / num2}")
            }}
            5 -> println("Programa finalizado")
            else -> println("opcion invalida")
        
        }

    } while(opcion != 5)
}
