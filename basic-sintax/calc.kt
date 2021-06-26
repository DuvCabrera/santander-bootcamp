
fun calculate(n1:Float, n2:Float, operation:(Float, Float)->Float):Float{
    val result = operation(n1,n2)
    return result
    """
    Will receive 2 paremeters and one function
    :parameter n1 : Float its a number
    :parameter n2 : Float its a number
    :function operation will realize the designated math
    """
}

fun sum(n1:Float, n2:Float) = n1.plus(n2) """ realize sum between 2 parameters """

fun minus(n1:Float, n2:Float) = n1.minus(n2) """ realize minus operation between 2 parameters """

fun times(n1:Float, n2:Float) = n1.times(n2) """ realize times operation between 2 parameters """

fun div(n1:Float, n2:Float) = n1.div(n2) """ realize div between 2 parameters """
