// media inteira
fun main(args: Array<String>) 
{
println("Digite a primeira nota:")
val numero1 = readLine()!!.toInt()

println("Digite a segunda número:")
val numero2 = readLine()!!.toInt()

println("Digite a terceira número:")
val numero3 = readLine()!!.toInt()


println("Digite a quarta número:")
val numero4 = readLine()!!.toInt()


var soma = numero1 + numero2 + numero3 + numero4
var media = soma / 4
print("A média é: ${media}")
}



