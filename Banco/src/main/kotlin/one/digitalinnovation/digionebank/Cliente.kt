package one.digitalinnovation.digionebank

class Cliente (
    name: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(name, cpf), Logavel{
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String ="""
        Nome: $name
        Cpf: $cpf
        Tipo: $clienteTipo
    """.trimIndent()
}