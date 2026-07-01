package classes06

interface Cashbackable {
    fun applyCashback(amount: Int) {
        println("Начислен кешбек: ${amount * 0.05}")
    }
 }
