
fun calculate(numberOne:Float, numberTwo:Float, opNumber:Int):Float{
    when{
        opNumber == 1 -> sum(numberOne, numberTwo)
        opNumber == 2 -> minus(numberOne, numberTwo)
        opNumber == 3 -> times(numberOne, numberTwo)
        opNumber == 4 -> div(numberOne, numberTwo)
        else -> "Error: parameter does not match with the expected"
    }
    return 
    """
    Will receive 2 paremeters and one function
    :parameter numberOne : Float its a number
    :parameter numberTwo : Float its a number
    :parameter opNumber : Int its the number of the operation that will
    be executed 
    """
}

fun sum(n1:Float, n2:Float) = n1.plus(n2) """ perform a sum between 2 parameters """

fun minus(n1:Float, n2:Float) = n1.minus(n2) """ perform a 'minus' operation between 2 parameters """

fun times(n1:Float, n2:Float) = n1.times(n2) """ perform times operation between 2 parameters """

fun div(n1:Float, n2:Float) = n1.div(n2) """ perform div between 2 parameters """
