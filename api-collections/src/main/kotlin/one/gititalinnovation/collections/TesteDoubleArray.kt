package one.gititalinnovation.collections

//testing DoubleArray
fun main() {
    //parameter: salarios :DoubleArray
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    //look in array components and print them
    salarios.forEach { println(it) }

    println("---------------")
    // access the values on array then modify them
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    //look in array components and print them
    salarios.forEach{println(it)}

    //another form of construct an doubleArray
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

}