fun main () {
    val vault = listOf(SmartLamp(name = "RX660", isOn), RobotVacuum(name = "mx880", isOn))
    for (i in vault) {
        if (internetDocument in i) {i.connectToNetwrok}
        i.performAction()
    }
}
