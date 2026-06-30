abstract class Device {
    abstract val name: String
    abstract val isOn: Boolean = false
    abstract fun performAction ()

    }
}


class SmartLamp(override val name: String,
                override val isOn: Boolean) : Device() {
    override fun performAction() {
        println("Лампа $name светится")
    }

}

class RobotVacuum (override val name: String,
                   override val isOn: Boolean): Device(), internetDocument {
    override fun performAction() {
        println("")
        println("Пылесос $name убирает дом")
    }

    override fun connectToNetwork() {
        println("Пылесос $name подключен к сети")
    }
}