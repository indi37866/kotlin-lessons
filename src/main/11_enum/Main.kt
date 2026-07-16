package enum11

fun main() {
    val myConfig = Config(Environment.PROD)
    println("URL: ${myConfig.url}, Timeout: ${myConfig.timeout}")
}