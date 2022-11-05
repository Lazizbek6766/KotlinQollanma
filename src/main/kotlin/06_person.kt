
class Persson(var name: String ) {

    fun display() {
        print("The name of the person is $name")
    }
}
/*
* This is main function. Entry point of the application.
* */
fun main(args: Array<String>) {

    val personObj = Persson("Steve")

    personObj.display()
}