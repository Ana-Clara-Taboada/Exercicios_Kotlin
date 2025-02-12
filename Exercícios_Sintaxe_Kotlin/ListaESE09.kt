fun main(args: Array<String>) {

    println("Digite a temperatura em graus Fahrenheit: ")  
    val fahrenheit = readLine()!!.toDouble()  
    
    
    val celsius = (fahrenheit - 32) / 1.8  
    println("A temperatura em graus Celsius é: %.2f".format(celsius))  

}
