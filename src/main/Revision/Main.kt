package revision

fun main() {
    val allTransactions = listOf<Double>(150.5, 0.0, 12_000.0, -50.0, 25_000.0)
    filterSuspiciousTransactions(allTransactions)
}

fun filterSuspiciousTransactions(list: List<Double>) {
    val newList = list.filter {it > 10_000.0}
    println("Найдено ${newList.count()} подозрительных транзакций.")
    println(newList)
}