package Exercise

fun repeatN(n: Int, action: () -> Unit) {
    for(i in 1..5) {
        action()
    }
}

fun main() {
    repeatN(5) {
        println("hello")
    }
}