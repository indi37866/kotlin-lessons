fun main () {
    val firstOrder = Order(1, "SALE20")
    val secondOrder = Order(2)
    println(firstOrder.promoCode?.length)
    println(secondOrder.promoCode?.length)
}