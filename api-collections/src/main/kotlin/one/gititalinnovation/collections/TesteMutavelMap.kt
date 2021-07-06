package one.gititalinnovation.collections

fun main() {
    val joao = Funcionario("João", 4000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("--------------------")
    repositorio.findAll().forEach { println(it) }

    println("--------------------")
    repositorio.remove(maria.nome)

    println("--------------------")
    repositorio.findAll().forEach { println(it) }
}