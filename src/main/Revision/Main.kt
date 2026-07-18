package revision

fun main() {
    val firstList = listOf<Double>(150.5, 0.0, 12_000.0, -50.0, 25_000.0)
    val secondList = listOf<Double>(150.2, 0.32, 8.23, 100.0, 2.1)
    val thirdList = listOf<Double> (10_000.1, 23.1)
    filterSuspiciousTransactions(firstList)
    println()
    filterSuspiciousTransactions(secondList)
    println()
    filterSuspiciousTransactions(thirdList)
}

fun filterSuspiciousTransactions(list: List<Double>) {
    val newList = list.filter {it > 10_000.0}
    when (newList.count()) {
        0 -> println("Подозрительных операций не найдено")
        1 -> println("Найдена 1 подозрительная операция")
        else -> println("Найдено ${newList.count()} подозрительных операций")
    }
    println(newList)
}