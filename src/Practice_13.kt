fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0
    if((hours / 24).toInt() > 0){
        var days = (hours / 24).toInt()
        total += days * 15
        hours -= (days * 24)
        total += (hours * 0.5)
    }else{
        if(hours > 5){
            total += (5 + ((hours - 5) * 0.5))
        }else{
            total += (hours)
        }
    }
    println(total)
}