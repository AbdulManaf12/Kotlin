fun main(args: Array<String>) {
    var age = readLine()!!.toInt()
    var result = when {
        (age >= 0 && age <= 11) -> "Child"
        (age >= 12 && age <= 17) -> "Teen"
        (age >= 18 && age <= 64) -> "Adult"
        (age >= 65) -> "Senior"
        else -> "Invalid age"
    }
    println(result)
}