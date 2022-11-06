/*
*   Inheritance
* */
fun main(args: Array<String>) {

    val dog = Dog()
    dog.bread = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    val cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    val hayvon = Hayvon()
    hayvon.color = "white"
    hayvon.eat()
}
/*
 *      Sinfni meros qilib olish uchun uni open kalit so'z bilan belgilang
 */
open class Hayvon {         // Super class / Ota-onalar class / Asosiy class

    var color: String = ""

    fun eat() {
        println("Yemoq")
    }
}

class Dog : Hayvon() {      // Kichik class / Olingan class

    var bread: String = ""

    fun bark() {
        println("Bark")
    }
}

class Cat : Hayvon() {      // Kichik class / Olingan class

    var age: Int = 0

    fun meow() {
        println("Meow")
    }
}