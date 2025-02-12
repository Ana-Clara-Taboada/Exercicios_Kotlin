fun main(args: Array<String>) {

    println("Digite quanto você ganha por hora: ")
    val phora = readLine()!!.toInt()  
    
    println("Digite quantas horas você trabalha por mês: ")
    val hora = readLine()!!.toInt()
    
    var salario = phora * hora
    println("O seu salário por mês é de: ${salario}")

}
