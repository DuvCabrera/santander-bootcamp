package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        name = "Jose da Cunha",
        cpf = "1231231231",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica((jose))
}