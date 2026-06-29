package org.example

class Car (
    val brand: String,
    val speed: Int,
)

class Player (
    val name: String,
    var health: Int = 100,

) {
    fun takeDamage (damage: Int) {
        this.health = health - damage
    }
}