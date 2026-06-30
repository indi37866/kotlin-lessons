package classes06

fun main () {
    val vault = listOf(SmartLamp(name = "RX660"), RobotVacuum(name = "mx880"))
    for (i in vault) {
        if (i is InternetDocument) {i.connectToNetwork()}
        i.performAction()
    }
}

