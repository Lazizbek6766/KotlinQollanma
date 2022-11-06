/*
*   Abstract Class
* */
fun main(args: Array<String>) {

//    var person = MyPerson()   // Ruxsat berilmagan. Siz mavhum sinf misolini yarata olmaysizNot allowed. You cannot create instance of abstract class

    val person = Hello()       // Ruxsat berilgan. Abstract Super class mos yozuvlar o'zgaruvchisi
    // pointing to child class object.
    person.name = "Hello world"
    person.eat()
    person.goToSchool()
}

abstract class MyPerson {     // you cannot create instance of abstract class

    abstract var name: String

    abstract fun eat()      // abstract properties are 'open' by default

    open fun getHeight() {} // A 'open' function ready to be overridden

    fun goToSchool() {}     // A normal function
}

class Hello: MyPerson() {

    override var name: String = "Salom dunyo"

    override fun eat() {
        // Our own code
    }
}