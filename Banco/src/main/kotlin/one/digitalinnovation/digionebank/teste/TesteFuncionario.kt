package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val eduardo = Pessoa(name = "Eduardo Cabrera", cpf = "123546789")
    println(eduardo.name)
    println(eduardo.cpf)

    val joao = Funcionario(name = "João Ricardo", cpf = "3248646186", BigDecimal.valueOf(2000.0))
    println(joao.name)
    println(joao.cpf)
    println(joao.salario)

}