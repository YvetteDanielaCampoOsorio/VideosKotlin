// Algoritmo que imprima los numeros pares del 1 al n

fun main() {
print("Ingrese un número : ")
val n = readLine()!!.toInt()
var i = 1
while (i <= n){
if (i % 2 == 0) {
println(i)
}
i++
}}
