fun calc(price : Double){
    var tax = (0.15 * price) + price
    println(tax)
}
fun main(args: Array<String>) {
    val price = readLine()!!.toDouble()
    calc(price)
}