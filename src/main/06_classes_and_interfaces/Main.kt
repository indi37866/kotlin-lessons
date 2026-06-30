fun main () {
    val vault = listOf(SmartLamp(name = "RX660", isOn), RobotVacuum(name = "mx880", isOn))
    for (i in vault) {
        if (internetDocument is i) {i.connectToNetwork()}
        i.performAction()
    }
}
