import java.math.BigInteger

/*
*       Tailrec funktsiyasi: Rekursiv funktsiyalar
*       -> Stackoverflow istisnosini oldini oladi
*
*   Fibonachchi seriyasi
*       1  1  2  3  5  8  13  21 34 55 ...
* */
fun main(args: Array<String>) {

    println(getFibonacciNumber(10, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0)
        return  b
    else
        return getFibonacciNumber(n - 1, a + b, a)
}