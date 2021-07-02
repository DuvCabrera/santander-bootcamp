package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}