package revision

fun main() {
    val firstLoad = NetworkResult.Success(123, "Усех")
    val secondLoad = NetworkResult.Error("Недостаточно средств")
    val thirdLoad = NetworkResult.Loading
    println(firstLoad.toLogMessage())
    println(secondLoad.toLogMessage())
    println(thirdLoad.toLogMessage())
}


fun NetworkResult.toLogMessage(): String {
    return when (this) {
        is NetworkResult.Success -> "Успех [код ${code}]: $data"
        is NetworkResult.Error -> "Ошибка: $message"
        is NetworkResult.Loading -> "Загрузка данных..."
    }

}