package revision

fun main() {
    val product1 = Product("Яблоко", 10.5)
    println(product1)
    val product2 = product1.copy(price = 11.0)
    println(product1 == product2)
    println(product1 == product1.copy())
}