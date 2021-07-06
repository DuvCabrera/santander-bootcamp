package one.gititalinnovation.collections

/*class for test listOf function */
fun main() {
    val joao = Funcionario("João", 4000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

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
