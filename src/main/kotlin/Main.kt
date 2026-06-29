package org.example

fun main() {
    val newPlayer = Player(health = 100, name = "Indo")
    println(newPlayer.health)
    newPlayer.takeDamage(30)
    println()
    println(newPlayer.health)
    val oldPlayer = Player(name = "Krut")
    println(oldPlayer.health)
    println(oldPlayer.name)
}