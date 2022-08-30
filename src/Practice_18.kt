fun main(args: Array<String>) {
    var letter = readLine()!![0]
    val names = arrayOf("John", "David", "Amy", "James", "Amanda", "Dave", "Bob", "Billy", "Bobby", "Diana", "Lenny", "Gina")
    var resulting_names = names.filter({it[0] == letter})
    resulting_names.forEach {
        println(it)
    }
} 