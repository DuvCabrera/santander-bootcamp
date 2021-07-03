package one.gititalinnovation.collections

fun main() {
    /* parameter pair:Pair accept String and Double
    * parameter map1 create a map that contain an pair of Key and Value*/
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1= mapOf(pair)
    /* print elements from map1*/
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    /* print elements from map2*/
    map2.forEach { (k,v) -> println("Chave: $k - Valor: $v") }
}