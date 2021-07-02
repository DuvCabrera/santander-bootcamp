package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario


fun main() {
    val joao = Analista(name = "João Ricardo", cpf = "3248646186", salario =2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}