/*
*   1. Companion Object
* */
fun main(args: Array<String>) {

    MyClass.count           // You can print it and check result

    val my = MyClass.typeOfCustomers()
    println(my)
}

class MyClass {

    companion object {

        var count: Int = -1             // Behaves like STATIC variable

        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like STATIC method
            return "Uzb"
        }
    }
}