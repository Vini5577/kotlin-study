package Exercise

fun main() {
    val button = "A"

    println(
        when(button) {

            "A" -> "Yes"

            "B" -> "No"

            "X" -> "Menu"

            "Y" -> "Nothing"

            else -> "there is no such button"
        }
    )
}