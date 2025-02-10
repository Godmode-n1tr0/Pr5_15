import kotlin.math.abs
import kotlin.math.ln
import kotlin.math.sqrt

fun main() {
    println("Введите значение x:")
    val input = readLine()

    try {
        val x = input?.toDouble() ?: throw IllegalArgumentException("Некорректный ввод. Ожидалось число.")

        val result = when {
            x <= 5 -> x * x + abs(x)
            x > 5 && x <= 8 -> (x + 5) / ln(x)
            else -> sqrt(x + 23) / x
        }

        println("Результат: $result")

    }
    catch (e: NumberFormatException) {
        println("Ошибка: некорректный ввод. Ожидалось число.")
    }
    catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    }
    catch (e: Exception) {
        println("Произошла неожиданная ошибка: ${e.message}")
    }
}