package enum11

enum class Environment {
    DEV,
    TEST,
    PROD
}

class Config(val env: Environment) {
    val url: String = when (env) {
        Environment.DEV -> "http://localhost:8080"
        Environment.TEST -> "http://test-server.com"
        Environment.PROD -> "http://api.production.com"
    }

    val timeout: Int = when (env) {
        Environment.DEV -> 5
        Environment.TEST -> 10
        Environment.PROD -> 30
    }
}

