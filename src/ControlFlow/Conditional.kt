package ControlFlow

fun main() {

    //if else: block
    var d: Int
    val check = true;

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // if else: inline
    val a = 1
    val b = 2

    println(if (a > b) a else b)

    // When

    val obj = "Hello"

    when (obj) {

        "1" -> println("One")

        "Hello" -> println("Greeting")

        else -> println("Unknown")
    }

    val obj2 = "Hello"
    val result = when (obj2) {

        "1" -> "One"

        "Hello" -> "Greeting"

        else -> "Unknown"
    }

    println(result)

    // When witch number
    val temp = 18

    val description = when {

        temp < 0 -> "very cold"

        temp < 10 -> "a bit cold"

        temp < 20 -> "warm"

        else -> "hot"
    }

    println(description)

}