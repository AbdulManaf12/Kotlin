fun main(args: Array<String>) {
    var input_times = 0
    while(true) {
        var input = readLine()!!.toInt()
        if(input == 0){
            break
        }
        input_times++
    }
    println(input_times)
}