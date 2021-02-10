fun main() {
    val empty = ""
    val blank = "              "

    println(empty.length)
    println(blank.length)

    println(empty.isEmpty() && empty.isBlank())
    println(blank.isEmpty() || blank.isBlank())
}