package one.gititalinnovation.collections

/*class for test listOf function */
fun main() {
    val joao = Funcioario("João", 4000.0, "CLT")
    val pedro = Funcioario("Pedro", 2000.0, "PJ")
    val maria = Funcioario("Maria", 3000.0, "CLT")

    /* array created with funcionario objects*/
    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach{println(it)}

    println("---------------")
    println(funcionarios.find {it.nome == "Maria"})

    /*sort the components in an array by a specific value*/
    println("---------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach {println(it)}

    /*group objects in a list using an attribute as reference */
    println("---------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach {println(it)}

}
