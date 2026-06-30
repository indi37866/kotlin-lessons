package classes06

fun main() {
    val warrior =  Warrior(name = "Indo")
    val paladin = Paladin(name = "Krut")
    warrior.attack(paladin)
    paladin.heal()
    paladin.block()
    paladin.attack(warrior)
    println()
    println(paladin.health)
    println(warrior.health)
}
