package Collections

fun main() {
    /* ======== MAP ======= */

    println("========= Map ==========")
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)
    println("orange" in readOnlyJuiceMenu.keys)
    println(200 in readOnlyJuiceMenu.values)

    println("")
    println("========= Mutable Map ==========")
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    juiceMenu.put("coconut", 150)
    println("after put: $juiceMenu")

    juiceMenu.remove("orange")
    println("after remove: $juiceMenu")

    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenuLocked)
}