package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Eduardo"

    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun infoPerson() = "$name e $cpf"

}