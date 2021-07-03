package one.gititalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 1250.0, 5000.0)

    for (salario in salarios){
        println(salario)
    }

    println("--------------")
    println("Maior salario: ${salarios.max()}")
    /* get the biggest number in salario array */
    println("Menor salario: ${salarios.min()}")
    /* get the smallest number in salario array */
    println("Media salarial: ${salarios.average()}")
    /* get the average of numbers in salario array */

    val salariosMaiorQue2500 = salarios.filter{ it > 2500.0}
    /* get values bigger them 2500.00 and add to a new array*/
    println("--------------")
    salariosMaiorQue2500.forEach{print(it)}
}