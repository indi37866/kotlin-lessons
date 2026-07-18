package revision

enum class DeliveryStatus {
    IN_WAREHOUSE, IN_TRANSIT, DELIVERED, LOST
}

fun getStatusMessage(stat: DeliveryStatus) {
    val currentStatus = when (stat) {
        DeliveryStatus.IN_WAREHOUSE -> "Ваша посылка собирается на складе"
        DeliveryStatus.IN_TRANSIT -> "Ваша посылка в пути"
        DeliveryStatus.DELIVERED -> "Посылка доставлена! Ждем вас снова"
        DeliveryStatus.LOST -> "Посылка к сожалению утеряна. Свяжитесь с поддержкой"
    }
    println(currentStatus)
}