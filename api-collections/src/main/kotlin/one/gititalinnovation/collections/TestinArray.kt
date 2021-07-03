package one.gititalinnovation.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    // for its utilized for access the values on "values" array
    // then print
    for (valor in values) {
        println(valor)
    }

    println("--------------------")
    //through lambda "forEach" print the valor on values
    values.forEach { valor ->
        println(valor)
    }

    println("---------------------")
    // print the values in values through of the
    // index on values
    for (index in values.indices){
        println(values[index])
    }

    println("---------------------")
    // pre-orden the array components and print
    values.sort()
    for (valor in values) {
        println(valor)
    }
}