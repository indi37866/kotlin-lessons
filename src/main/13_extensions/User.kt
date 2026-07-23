package exten13

val User.isAdult: Boolean
    get() = this.age >= 18

class User (val firstName: String,val lastName: String?,val age: Int)

fun User.getFormattedName(): String {
    return "$firstName ${lastName?: ""}"
}
