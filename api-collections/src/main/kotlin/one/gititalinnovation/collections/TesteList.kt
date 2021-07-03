package one.gititalinnovation.collections

/*class for test listOf function */
fun main() {
    val joao = Funcioario("João", 1000.0)
    val pedro = Funcioario("Pedro", 2000.0)
    val maria = Funcioario("Maria", 3000.0)

    /* array created with funcionario objects*/
    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach{println(it)}

    println("---------------")
    println(funcionarios.find {it.nome == "Maria"})
}

/*funcionario class created and string appearance modified for better look*/
data class Funcioario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome : $nome
            Salário: $salario
        """.trimIndent()
}