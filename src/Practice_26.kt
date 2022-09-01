abstract class Component7(width: Int, height: Int) {
    protected var width = width
    protected var height = height
    abstract fun show()
}
class Button7(width: Int, height: Int): Component7(width, height) {
    private var name: String = "Button"
    fun tap() {
        println(name + " was tapped")
    }

    override fun show() {
        println("Showing a Button")
    }
}
class Image7(width: Int, height: Int): Component7(width, height) {
    fun draw() {
        println(width.toString()+"x"+height.toString())
    }

    override fun show() {
        println("Showing a Image")
    }
}
fun main(args: Array<String>) {
    val b1 = Button7(200, 50)
    b1.tap()
    b1.show()

    val img = Image7(300, 500)
    img.draw()
    img.show()
}