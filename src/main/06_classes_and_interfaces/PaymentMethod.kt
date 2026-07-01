package classes06

abstract class PaymentMethod {
    var balance: Int = 10_000
    abstract fun pay (amount: Int)
}

class BankCard (): PaymentMethod(), Cashbackable {
    override fun pay(amount: Int) {
        balance -= amount
        println("Оплата картой на сумму $amount. Остаток $balance")
    }
    override fun applyCashback(amount: Int) {}
}

class CryptoWallet (): PaymentMethod() {
    override fun pay(amount: Int) {
        balance -= amount
        println("Оплата криптой на сумму $amount. Остаток: $balance")
    }
}