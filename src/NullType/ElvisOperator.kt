package NullType

fun main() {

    var nullString: String? = null
    println(nullString?.length ?: 0)
}