import java.util.stream.Stream

fun main(args: Array<String>) {
    println("Hello Youtube from Kotlin!!")
    var users = Users()
    users.name = "Peter"
    users.salary = 100

    println("Users: ${users.name}")

    doNullCheck("Cisco")

    Stream.of(1, 2, 3, 4, 5)
        .filter({ value -> value % 2 == 0 })
        .forEach(::println)

    // Java can be used in kotlin and vice versa
    var usersJava = UsersJava()
    usersJava.name = "Ramon"

    println(UsersK.get())
}

private fun doNullCheck(name: String) {
    // Null check
    var nullCheck: String? = null
    println(nullCheck?.length)
}

class UsersK {
    companion object {
        @JvmStatic
        val company: String = "Youtube"

        @JvmStatic
        fun get(): String {
            return UsersK.company
        }
    }
}