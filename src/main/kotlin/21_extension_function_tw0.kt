/*
*   Extension Functions: 2-misol
* */
fun main(args: Array<String>) {

    val str1: String = "Hello "
    val str2: String = "World"

    val str3: String = "Hey "

    println(str3.add(str1, str2))

    val x: Int = 6
    val y: Int = 10

    val greaterVal = x.greaterValue(y)

    println(greaterVal)
}

fun String.add(s1: String, s2: String): String {

    return this + s1 + s2
}

fun Int.greaterValue(other: Int): Int {

    if (this > other) {
        return this
    } else {
        return other
    }
}