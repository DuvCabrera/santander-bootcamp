
fun main(){
    var a = calculate(2f,2f,1)
    var b = calculate(2f,2f,2)
    var c = calculate(2f,2f,3)
    var d = calculate(2f,2f,4)
    print(a)
    print(b)
    print(c)
    print(d)

}


fun calculate(numberOne:Float, numberTwo:Float, opNumber:Int):Float?{
    return when{
        opNumber == 1 -> sum(numberOne, numberTwo)
        opNumber == 2 -> minus(numberOne, numberTwo)
        opNumber == 3 -> times(numberOne, numberTwo)
        opNumber == 4 -> div(numberOne, numberTwo)
        else -> null
    }
    /*
    Will receive 2 paremeters and one function
    :parameter numberOne : Float its a number
    :parameter numberTwo : Float its a number
    :parameter opNumber : Int its the number of the operation that will
    be executed 
    */
}

fun sum(n1:Float, n2:Float) = n1.plus(n2) /* perform a sum between 2 parameters */

fun minus(n1:Float, n2:Float) = n1.minus(n2) /* perform a 'minus' operation between 2 parameters */

fun times(n1:Float, n2:Float) = n1.times(n2) /* perform times operation between 2 parameters */

fun div(n1:Float, n2:Float) = n1.div(n2) /* perform div between 2 parameters */

fun fatorial(n1:Float, n2: Float):Float{
    if (n1 == 1f || n2 == 1f){ return 1f}

    if (n1 == 0f || n2 == 0f){ return 0f}

    return n1 * fatorial(n1 - 1, n2); n2 * fatorial(n1, n2 -1)
}