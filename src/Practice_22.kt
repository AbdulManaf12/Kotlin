class Buttond {
    var width: Int = 0
    var height: Int = 0
    // your code goes here
    set(value){
        if(value >= 50){
            field = value
        }else{
            field = 50
        }
    }
}
fun main(args: Array<String>) {
    val b1 = Buttond()
    b1.height = readLine()!!.toInt()
    b1.width = readLine()!!.toInt()

    println(b1.width+b1.height)
}