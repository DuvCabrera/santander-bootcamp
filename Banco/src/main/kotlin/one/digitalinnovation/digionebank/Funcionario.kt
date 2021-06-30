package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Funcionario (
    override val name: String,
    override val cpf: String,
    val salario: BigDecimal
    ) : Pessoa(name, cpf) {
}