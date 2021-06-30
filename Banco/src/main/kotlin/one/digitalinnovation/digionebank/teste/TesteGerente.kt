package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val maria = Analista(name = "Maria Ricardo", cpf = "3248646186", salario =2000.0)
    ImprimeRelatorioFuncionario.imprime(maria)

}

