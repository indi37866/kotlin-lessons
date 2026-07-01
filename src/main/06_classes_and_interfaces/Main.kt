package classes06

fun main() {
    val myCard = BankCard()
    val myWallet = CryptoWallet()
    myCard.pay(1000)
    myCard.applyCashback(1000)
    myWallet.pay(1000)
}