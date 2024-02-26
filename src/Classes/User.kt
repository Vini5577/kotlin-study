package Classes

data class User(val name: String = "Vini", val id: Int = 1)

fun main() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User ("Max", 2)

    println(user)
    println("user === secondUser: ${user === secondUser}")
    println("user === thirdUser: ${user === thirdUser}")

    println(user.copy())
    println(user.copy("Max"))

    println(user.copy(id = 3))
}