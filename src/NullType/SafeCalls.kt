package NullType

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    var nullString: String? = null
    println(lengthString(nullString))

    var nullString2: String? = null
    println(nullString2?.uppercase())
}