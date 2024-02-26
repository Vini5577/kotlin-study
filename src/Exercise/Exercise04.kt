package Exercise

fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requestd = "smtp"
    val isSupported = requestd.toUpperCase() in SUPPORTED

    println("Support for $requestd: $isSupported")
}