/*
*   Data Class
* */
fun main(args: Array<String>) {

    val user1 = User("Sam", 10)

    val user2 = User("Sam", 10)

    println(user1.toString())

    if (user1 == user2)
        println("Equal")
    else
        println("Not equal")

    val newUser = user1.copy(id = 25)
    println(newUser)
    val newUser2 = user2.copy(id = 15)
    println(newUser2)
}

data class User(var name: String, var id: Int)