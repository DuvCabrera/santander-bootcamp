package one.gititalinnovation.collections

fun main() {
    val joao = Funcionario("João", 4000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    /*make the unior of two lists*/
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("----------------------")
    /*subtract on list for another*/
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("----------------------")
    /*return the value that repeat in both */
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it) }
}