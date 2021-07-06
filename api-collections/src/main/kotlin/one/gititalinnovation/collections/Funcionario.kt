package one.gititalinnovation.collections

/*funcionario class created and string appearance modified for better look*/
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome : $nome
            Salário: $salario
            Tipo: $tipoContratacao
        """.trimIndent()
}