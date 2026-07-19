package lambda12

fun main() {
    val contactChecker = fun(text: String?) {println(text?: "Текст отсутствует")}
    contactChecker(null)
}

