package lambda12

fun main() {
    val doubleNumber: (Int) -> Int = {it * 2}
    println(doubleNumber(12))
}