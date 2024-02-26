package Exercise

fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    val total = greenNumbers.count() + redNumbers.count();

    println("The greenNumbers has ${greenNumbers.count()} items")
    println("The redNumbers has ${redNumbers.count()} items")
    println("Total: $total")

}