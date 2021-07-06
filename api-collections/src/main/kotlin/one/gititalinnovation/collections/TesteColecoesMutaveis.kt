package one.gititalinnovation.collections

fun main() {
    val joao = Funcionario("João", 4000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

    /* make a list of funcionarios*/
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("-----LIST--------")
    /*add another funcionario at the list*/
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-------------")
    /*remove a funcionario from the list*/
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("------SET-------")
    /*create a set of funcionarios*/
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("------SET-------")
    /*add elemento to the set*/
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }
}