// your code goes here
class Button{
    var width : Int = 0;
    var height : Int = 0;
}
fun main(args: Array<String>) {
    val b1 = Button()
    b1.width = readLine()!!.toInt()
    b1.height = readLine()!!.toInt()

    println(b1.width+b1.height)
}