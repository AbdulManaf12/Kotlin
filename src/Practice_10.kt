fun main(args: Array<String>) {
    val names = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    var day = readLine()!!.toInt()
    if(day < 1 || day > 7){
        println("Invalid day")
    }
    else {
        println(names[day])
    }
}