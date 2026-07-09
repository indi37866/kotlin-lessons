package setandget_09

class Car {
    var speed: Int = 0
        set(value: Int) {
            if (value < 0) field = 0
            if (value > 250) field = 250
        }
}