fun main(args: Array<String>) {

    println("Digite a temperatura em graus Celsius: ")  
    val celsius = readLine()!!.toDouble()  
    
    
    val fahrenheit = celsius * 1.8 + 32  
    println("A temperatura em graus Fahrenheit é: %.2f".format(fahrenheit))  
}
