fun main(args: Array<String>) {
    var num = readLine()!!.toInt()
    var result = 0;
    while(num > 0){
        result += num%10;
        num /= 10;
    }
    println(result)
}