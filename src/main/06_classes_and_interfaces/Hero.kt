package classes06

abstract class Hero {
    abstract val name: String
    var health: Int = 100
    abstract fun attack (target: Hero)
}

class Warrior(override val name: String): Hero {
    override fun attack(target: Hero) {
        health -= 10
    }
}

class Paladin(override val name: String) : Hero(), Defender, Healer {
    override fun attack(target: Hero) {
        health -= 10
    }

    override fun block() {
        println("Паладин $name поднял щит")
    }

    override fun heal() {
        health += 20
    }
}