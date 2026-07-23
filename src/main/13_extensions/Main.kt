package exten13

fun main() {
    val firstUser = User("Иван", "Ветров", 23)
    val secondUser = User("Indo", null, 17)
    println(firstUser.isAdult)
    println(firstUser.getFormattedName())
    println(secondUser.isAdult)
    println(secondUser.getFormattedName())
}
