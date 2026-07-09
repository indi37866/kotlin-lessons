package setandget_09
class Product(val basePrice: Double, val discountPercent: Int) {
    val finalPrice: Double
        get() {
            val discountAmount = basePrice * discountPercent / 100.0
            return basePrice - discountAmount
        }
}