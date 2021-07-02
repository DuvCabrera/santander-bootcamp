package one.digitalinnovation.digionebank

abstract class Funcionario (
    name: String,
    cpf: String,
    val salario: Double
    ) : Pessoa(name, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $name
        Cpf: $cpf
        Salário: $salario
        Auxílio: ${calculoAuxilio()}
    """.trimIndent()
    }
