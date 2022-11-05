/*
*   INFIX FUNCTIONS
* */
fun main(args: Array<String>) {

    val x: Int = 6
    val y: Int = 10

    val greaterVal = x findGreaterValue y   // x.findGreaterValue(y)

    println(greaterVal)
}

infix fun Int.findGreaterValue(other: Int): Int {       // INFIX va kengaytma funksiyasi

    if (this > other)
        return this
    else
        return other
}

/*
*       1. Barcha INFIX funksiyalari kengaytma funksiyalaridir
*       Lekin barcha Kengaytma funksiyalari INFIX emas
*       2. INFIX funksiyalari faqat BITTA PARAMETERga ega
* */