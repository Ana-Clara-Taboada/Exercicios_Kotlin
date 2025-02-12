@file:JvmName("JDoodle")
import java.text.DecimalFormat

fun main(args: Array<String>) {

    println("Digite o raio de um círculo: ")
    val raio = readLine()!!.toDouble()  
    
    val pi: Double = 3.14159265359
    val area = raio * raio * pi 

    val format = DecimalFormat("#.##")  
    val resultado = format.format(area)
    
    println("A área é: ${resultado}")
    
}