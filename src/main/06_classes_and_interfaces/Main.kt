package classes06

fun main() {
    val myCard = BankCard()
    val myWallet = CryptoWallet()
    myCard.pay(1000)
    myWallet.pay(1000)
}