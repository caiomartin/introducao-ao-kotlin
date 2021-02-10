const val MIN_AGE = 16
const val MAX_AGE = 68

fun main() {
    var age = (70..100).random()
    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE && age <= MAX_AGE)
}