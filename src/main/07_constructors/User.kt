class User (val login: String, val password: String) {
    init {
        if (password.length < 6) println("Внимание: у пользователя $login слишком " +
                "слабый пароль")
    }
    constructor(login: String) : this(login = login) {
        println("Для пользователя $login создан автоматический пароль")
    }
}