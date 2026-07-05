import java.security.interfaces.RSAMultiPrimePrivateCrtKey

class  Product (val name: String, val price: Int) {
    var discount: Int = 0
    init {
        println("Товар $name успешно добавлен на склад. Базовая цена: $price")
    }
    constructor(name: String, price: Int, discountPercent: Int = 20) : this(name, price) {
        price -= price * discountPercent / 100
        this.discount = discountPercent
        println("Применена скидка ${discountPercent}%. Новая цена товара: $price")
    }
}