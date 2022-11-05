/*
*   Extension Functions: 1-misol
* */
fun main(args: Array<String>) {

    val student = Studentt()
    println("Pass status: " + student.hasPassed(57))

    println("Scholarship Status: " + student.isScholar(57))
}

fun Studentt.isScholar(marks: Int): Boolean {
    return marks > 95
}

class Studentt {         // O'ZIMIZNING SINFIMIZ

    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}