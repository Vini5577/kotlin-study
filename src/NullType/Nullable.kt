package NullType

fun main() {
    var neverNull: String = "This can't be null"

    // neverNull = null

    var nullable: String? = "You can keep a null here"

    nullable = null

    var inferredNonNull = "The compiler assumes non-nullable"

    // inferredNonNull = null

    fun strLenght(notNull: String): Int {
        return notNull.length
    }

    println(strLenght(neverNull))
    // println(strLenght(nullable))
}