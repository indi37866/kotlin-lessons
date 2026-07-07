fun main () {
    val temp: List<Int?> = listOf(22, null, 24, null, 25)
    val finalTemp = temp.filter{it != null}
    println(finalTemp)
}