open class Component6(width: Int, height: Int) {
    private var width = width
    private var height = height

    fun getWidth(): Int {
        return width;
    }
    fun getHeight(): Int {
        return height;
    }
}
open class Button6(width: Int, height: Int): Component6(width, height) {
    private var name: String = "Button"
    protected open fun tap() {
        println(name + " was tapped")
    }
}
class SubButton(width: Int, height: Int) : Button6(width, height){
    public override fun tap(){
        super.tap();
    }
}
class Image6(width: Int, height: Int): Component6(width, height) {
    public fun draw() {
        println(getWidth().toString()+"x"+getHeight().toString())
    }
}
fun main(args: Array<String>) {
    val b1 = SubButton(200, 50)
    b1.tap()

    val img = Image6(300, 500)
    img.draw()
}