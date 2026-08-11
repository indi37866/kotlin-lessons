package revision

fun main() {
    val firstProfile = UserProfile("Иван", 12.10)
    println(firstProfile.getFormattedBalance())
}

fun UserProfile.getFormattedBalance(): String {
    return "Ьаланс пользователя $name: $balance ${UserProfile.DEFAULT_CURRENCY}"
}