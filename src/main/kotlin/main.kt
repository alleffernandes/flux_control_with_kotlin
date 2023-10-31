/*
1. Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
“1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”

2. Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada:
“50 49 48 47 .. .. .. 2 1”

3. Usando a resolução do exercício 1, não imprima os números múltiplos de 5.

4. Faça a soma de todos os números no intervalo de 1 a 500.

5. Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando
o caracter #.
Se a entrada do programa for 3, teremos:
#
##
###
Se a entrada do programa for 5, teremos:
#
##
###
####
#####
 */

/*
1. Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?

2. FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
a. Quando um número for divisível por 3, imprimir Buzz.
b. Quando um número for divisível por 5, imprimir Fizz.
c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.
3. Escreva um programa capaz de receber um texto e imprimi-lo invertido.
Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM
4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
“xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false
 */

/*
Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os funcionários a
pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor. Ou seja, caso o
funcionário invista 100 reais, a empresa investe mais 100. Este fundo de investimento possui rendimento de 0,2% ao mês.
Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria já que conhece
investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.
Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com saldo 0 e que investirão
5% do salário.
Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?
 */

fun desafio1() {
    for (n in 1..50) {
        print("$n ")
    }
}

fun desafio2() {
    for (n in 50 downTo 1) {
        print("$n ")
    }
}

fun desafio3() {
    for (n in 1..50) {
        if (n % 5 != 0) {
            print("$n ")
        }
    }
}

fun desafio4() {
    var soma = 0
    for (n in 1..500) {
        soma += n
    }
    print(soma)
}

fun desafio5(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun desafio6() {
    val balao = 7
    val caixaDagua = 2000
    var quantidadeDeBaloes = 0
    while ((balao * quantidadeDeBaloes) + balao < caixaDagua) {
        quantidadeDeBaloes++
    }
    print("$quantidadeDeBaloes")
}

fun fizzbuzz() {
    var n = 1
    while (n <= 50) {
        if (n % 15 == 0) {
            print("FizzBuzz ")
        } else if (n % 3 != 0 && n % 5 == 0) {
            print("Fizz ")
        } else if (n % 3 == 0 && n % 5 != 0) {
            print("Buzz ")
        } else {
            print("$n ")
        }
        n++
    }
}

fun invertendoTexto(texto: String) {
    var quantLetras = texto.length - 1
    while (quantLetras >= 0) {
        print(texto[quantLetras])
        quantLetras--
    }
}

fun verificarSeTrue(texto: String): Boolean {
    var contarX = 0
    var contarO = 0
    var i = 0
    while (i < texto.length) {
        if (texto[i] == 'x') {
            contarX++
        } else if (texto[i] == 'o') {
            contarO++
        }
        i++
    }
    return ((contarX == contarO) && (contarX != 0))
}

fun investimentos() {
    var salario = 10000f
    var saldoPaula = 0f
    var saldoAna = 0f
    var mes = 0
    do {
        saldoAna += (salario * 0.05f) + (salario * 0.05f) + (saldoAna * 0.002f)
        saldoPaula += (salario * 0.05f) + (saldoPaula * 0.008f)
        mes++
    } while (saldoAna > saldoPaula)
    println("No mês $mes")
}

fun main() {
//    desafio1()
//    desafio2()
//    desafio3()
//    desafio4()
//    desafio5(5)
//    desafio6()
//    fizzbuzz()
//    invertendoTexto("Kotlin")
//    println(verificarSeTrue("xxooox"))
//    println(verificarSeTrue("xxxxo"))
//    println(verificarSeTrue("bdefghjij"))
//    println(verificarSeTrue("ooooxzzzzz"))
//    investimentos()
}




