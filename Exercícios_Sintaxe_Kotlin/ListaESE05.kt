fun main(args: Array<String>) 
{
    println("Digite o tamanho em metros:")
    val met = readLine()!!.toInt()
    
    var cent = met * 100
    print("O valor em centímetros é: ${cent}")


}