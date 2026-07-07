fun main () {
    val firstOrder = Order("SALE20")
    val secondOrder = Order("")
    println(firstOrder.orderId?.length)
    println(secondOrder.orderId?.length)
}