fun main(args: Array<String>) {
    var start = readLine()!!.toInt()
    var end = readLine()!!.toInt()
    var sum = 0
    for(i in start..end)
        sum += i
    println(sum)
}
