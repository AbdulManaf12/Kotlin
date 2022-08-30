fun letter_count(target : Char, message : String): Int {
    var count = 0
    for (i in message.toCharArray()){
        if(i == target)
            count++
    }
    return count
}
fun main(args: Array<String>) {
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}