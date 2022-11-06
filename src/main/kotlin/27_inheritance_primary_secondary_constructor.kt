/*
*   Birlamchi va ikkilamchi konstruktorlar bilan meros
* */
fun main(args: Array<String>) {

    var dog = TheDog("Black", "Pug")
}

open class TheAnimal {      // Super class / Ota-ona class /  Asosiy class

    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }
}

class TheDog : TheAnimal {    // Kichik class / Olingan class

    var bread: String = ""

    constructor(color: String, breed: String): super(color) {
//
//        Olingan Classdagi kod Super kalit so'zidan foydalangan
//        holda Superclass funktsiyalari va xususiyatga ega bo'lgan
//        ilovalarni chaqirishi mumkin
//
        this.bread = breed

        println("From Dog: $color and $breed")
    }
}