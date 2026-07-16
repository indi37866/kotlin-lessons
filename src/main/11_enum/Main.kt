package enum11
fun main() {
    val myOrder = Order(OrderStatus.CANCELLED)
    myOrder.process()
}