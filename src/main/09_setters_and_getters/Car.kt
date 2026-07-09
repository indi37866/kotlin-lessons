package setandget_09

class Hero () {
    val isUltimateReady: Boolean
        get() = mana > 80
    var mana: Int = 100
        set(value: Int) {field = value.coerceIn(0, 150)}
}