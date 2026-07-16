package enum11

enum class OrderStatus {
    PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}

class Order(var status: OrderStatus) {
    fun process() {
        val message = when (status) {
            OrderStatus.PENDING -> "Заказ в ожидании"
            OrderStatus.PROCESSING -> "Заказ готовится"
            OrderStatus.SHIPPED -> "Заказ в пути"
            OrderStatus.DELIVERED -> "Заказ доставлен"
            OrderStatus.CANCELLED -> fail("Заказ отменен")
        }
        println(message)
    }
}

fun fail(message: String) {
    throw IllegalArgumentException(message)
}