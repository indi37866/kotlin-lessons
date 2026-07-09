package setandget_09

class Hero () {
    var isUltimateReady = false
        set(value: Boolean) {if (mana > 80) true}
    var mana: Int = 100
        set(value: Int) {field = value.coerceIn(0, 150)}

}