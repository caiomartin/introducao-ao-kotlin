fun main() {
    print(getFullName("Caio", "martins"))
}

private fun getFullName(name: String, lastName: String):String {
    val fulname = "$name $lastName"
    return fullName
}

private fun getFullName(name: String, lastName: String):String {
    return "$name $lastName"
}

private fun getFullName(name: String, lastName: String) = "$name $lastName"
