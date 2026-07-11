open class Item(open val name: String) {
    open fun getInfo() {
        println("Это предмет $name")
    }
}

class Weapon (override val name: String, val damage: Int): Item(name) {
    override fun getInfo() {
        println("Оружие $name с уроном $damage")
    }
}

class Potion (override val name: String, val healAmount: Int): Item(name) {
    override fun getInfo() {
        println("Зелье $name, восстанавливает $healAmount здоровья")
    }
}

class Player {
    var health: Int = 100
        set(value: Int) {
            field = value.coerceIn(0, 200)
        }
    val isAlive: Boolean
        get() = health > 0
    fun usePotion(potion: Potion) {
        health += potion.healAmount
        println("Зелье вылечило на ${potion.healAmount} единиц, осталось $health здоровья")
    }
    fun attack(target: Player, weapon: Weapon) {
        target.health -= weapon.damage
        if (weapon.damage > 50) println("Критический удар!") else println("Удар!")
        println("Противник потерял ${weapon.damage} здоровья, осталось ${target.health}")
    }
}