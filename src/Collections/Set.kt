package Collections

fun main() {
    /* ======== SET ======= */

    //Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
    println("this set has ${readOnlyFruit.count()} items")
    println("banana" in readOnlyFruit);

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruit)
    fruit.add("dragonfruit")
    println("fruit after add: $fruit")

    fruit.remove("dragonfruit")
    println("fruit after remove: $fruit")

    val fruitLocked: Set<String> = fruit
    println(fruitLocked)
}