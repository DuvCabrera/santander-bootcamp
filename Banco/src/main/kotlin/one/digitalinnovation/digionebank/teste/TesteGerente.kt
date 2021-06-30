package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(name = "Maria Ricardo", cpf = "3248646186", salario =2000.0, senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}

