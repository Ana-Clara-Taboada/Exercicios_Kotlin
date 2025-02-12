fun main(args: Array<String>) {

     println("Digite o tamanho do lado do quadrado:")
     val lad = readLine()!!.toInt()
    
    
    var area = lad * lad
    println("A área do quadrado é: ${area}")
    var result = area * 2
    println("O dobro da área do quadrado é: ${result}")
    
}