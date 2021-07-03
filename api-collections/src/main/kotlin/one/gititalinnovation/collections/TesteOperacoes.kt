package one.gititalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 1250.0, 5000.0)

    for (salario in salarios){
        println(salario)
    }

    println("--------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    /* get the biggest number in salario array */
    println("Menor salario: ${salarios.minOrNull()}")
    /* get the smallest number in salario array */
    println("Media salarial: ${salarios.average()}")
    /* get the average of numbers in salario array */

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0}
    /* get values bigger them 2500.00 and add to a new array*/
    println("--------------")
    salariosMaiorQue2500.forEach{print(it)}

    println("--------------")
    println(salarios.count { it in 2000.0..5000.0})
    /* in a specific range count the number of values
    * in that range that are in the array*/

    println("--------------")
    println(salarios.find { it == 1500.0})
    println(salarios.find { it == 500.0})
    /*look in the array and find the value*/

    println("--------------")
    println(salarios.any { it == 1000.0})
    /*return a boolean if its found or not the element searched*/
}