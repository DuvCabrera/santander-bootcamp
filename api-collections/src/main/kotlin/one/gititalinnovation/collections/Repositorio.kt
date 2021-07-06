package one.gititalinnovation.collections

class Repositorio<T> {
    /*class that works how repository*/
    private val map = mutableMapOf<String, T>()

    /*create a map receive two parameters id: and Value*/
    fun create(id: String, value: T){
        map[id] = value
    }

    /*remove an item from the map*/
    fun remove(id:String) = map.remove(id)

    /*find a specific id in the map*/
    fun findById(id: String) = map[id]

    /*return all items from the map*/
    fun findAll() = map.values
}