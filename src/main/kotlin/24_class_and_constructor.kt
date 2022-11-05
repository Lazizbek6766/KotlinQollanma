/*
*   Class, asosiy konstruktor, ikkilamchi konstruktor va Init boshlang'ich blok
* */
fun main(args: Array<String>) {

    val student = Student("Steve", 10)

    println(student.id)
}

class Student(var name: String) {

    var id: Int = -1

    init {
        println("Student has got a name as $name and id is $id")
    }

    constructor(n: String, id: Int): this(n) {
        //Ikkilamchi konstruktorning tanasi init blokidan keyin chaqiriladi
        this.id = id
    }
}