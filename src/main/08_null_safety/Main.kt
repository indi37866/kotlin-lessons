fun main () {
    val name = "Alex"
    val biography: String? = null
    val finalBiography = biography ?: "Информация не укзаана"
    println("Пользователь: $name . О себе: ${finalBiography}")
}