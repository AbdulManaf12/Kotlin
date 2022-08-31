fun shippingCost(amount: Double, international: Boolean): Double {
    return if(international){
        var estimatedShippingCost = amount * 0.15;
        (when {
            (estimatedShippingCost >= 50) -> 50
            else -> estimatedShippingCost
        }).toDouble()
    }
    else{
        (when{
            (amount >= 75) -> 0
            else -> (amount * 0.10)
        }).toDouble()
    }
}
fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()
    println(shippingCost(total, international))
}