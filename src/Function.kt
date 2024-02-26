fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x + y;
}

fun sumInline(x: Int, y: Int) = x + y

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println(message)
}

fun main() {
    hello();
    println(sum(1,2));

    printMessageWithPrefix(prefix = "Log", message = "Hello")

    printMessageWithPrefix("Hello", "Log")

    printMessageWithPrefix("Hello")

    printMessage("Hello")

    println(sumInline(1, 2))
}