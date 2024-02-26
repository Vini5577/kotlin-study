package Collections

fun main() {
/* ======== LIST ======= */
    // Read pmçu çost
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    println("The first item in the list is: ${readOnlyShapes[0]}");
    println("The first item in the list is (.first()): ${readOnlyShapes.first()}")
    println("The Last item in the list is: ${readOnlyShapes.last()}")
    println("This list has ${readOnlyShapes.count()} items")
    println("circle" in readOnlyShapes)

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle");
    println(shapes)
    shapes.add("pentagon")
    println("mutableList after add: $shapes")

    shapes.remove("pentagon")
    println("mutableList after remove: $shapes")

    val shapesLocked: List<String> = shapes;
    println("The shape locked: $shapesLocked")
}