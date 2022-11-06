interface ICardCashBack {
    fun getCashbackValue(): Float
}

enum class CreditCardType(val color: String, val maxLimit: Int = 1000000): ICardCashBack {
    SILVER("gray", 50000) {
        override fun getCashbackValue(): Float = 0.02f
    },
    GOLD("gold"){
        override fun getCashbackValue(): Float = 0.04f
    },
    PLATINUM("black"){
        override fun getCashbackValue(): Float = 0.06f
    }
}


fun main() {

    /* Access properties and methods */
    println(CreditCardType.SILVER.color)    // gray
    println(CreditCardType.SILVER.getCashbackValue())   // 0.02

    /* Enum constants are objects of enum class type. */
    val peterCardType: CreditCardType = CreditCardType.GOLD

    /* Each enum object has two properties: ordinal and name */
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD)    // OR CreditCardType.GOLD.name

    /* Each enum object has two methods: values() and valueOf() */
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) }

    /* Using in 'when' statement */
    when(peterCardType) {
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has gold card")
        CreditCardType.PLATINUM -> println("Peter has platinum card")
    }
}