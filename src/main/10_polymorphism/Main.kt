fun main() {
    val enemyPotion = Potion("малое зелье здоровья", 10)
    val firstPlayerPotion = Potion("большое зелье здоровья", 35)
    val firstPlayerWeapon = Weapon("Меч", 15)
    arrayOf<Item>(
        firstPlayerWeapon,
        firstPlayerPotion,
        enemyPotion
    ).forEach {
        it.getInfo()
    }

    val firstPlayer = Player()
    val enemy = Player()
    val enemyWeapon = Weapon("Мачета", 10)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    enemy.usePotion(enemyPotion)
    enemy.attack(firstPlayer, enemyWeapon)
    firstPlayer.usePotion(firstPlayerPotion)
    firstPlayer.usePotion(firstPlayerPotion)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    enemy.usePotion(enemyPotion)
    enemy.attack(firstPlayer, enemyWeapon)
    firstPlayer.usePotion(firstPlayerPotion)
    println()
    println("Внимание, игрок активировал режим берсерка!")
    println()
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
    firstPlayer.attack(enemy, firstPlayerWeapon)
}