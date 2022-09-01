open class Component(var width: Int, var height: Int) {

}
class Button4(width: Int, height: Int) {
    var name: String = "Button"
    fun tap() {
        println("$name was tapped")
    }
}
class Image(width: Int, height: Int) : Component(width, height){
    fun draw(){
        println(width.toString() + "x" + height)
    }
}
fun main(args: Array<String>) {
    val b1 = Button4(200, 50)
    b1.tap()

    val img = Image(300, 500)
    img.draw()
}