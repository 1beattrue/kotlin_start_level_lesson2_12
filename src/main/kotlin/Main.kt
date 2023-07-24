import java.lang.Exception

fun main() {
    // исключения
    println(sum("10", "asfgkj"))
}

fun sum(a: String, b: String): Int {
    return try { // отличие от java в том, что блок try также умеет возвращать значение (последняя строчка внутри блока)
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e: Exception) {
        println(e)
        0
    }
}