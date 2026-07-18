package revision

class RobotVacuum {
    var battery: Int = 80
    fun charge() {
        while (battery < 100) {
            battery += 5
            println("Зарядка: $battery")
        }
        println("Робот готов к уборке")
    }
}