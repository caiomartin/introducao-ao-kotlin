const val EGUAL = 0
const val LESS = -1
const val MORE = 1

fun main() {
    val d = 220
    val t = d

    println(d == t)
    println(d.equals(t))

    println(d != t)
    println(!d.equals(t))
}