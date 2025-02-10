import kotlin.random.Random

fun main(){
    try{

        print("Введите число от 0 до 9: ");
        val a = readln(). toInt();
        val digit = a?.toInt() ?: throw IllegalArgumentException("Некорректный ввод. Ожидалась цифра от 0 до 9.")
        when (digit) {
            0 -> println("Ноль")
            1 -> println("Один")
            2 -> println("Два")
            3 -> println("Три")
            4 -> println("Четыре")
            5 -> println("Пять")
            6 -> println("Шесть")
            7 -> println("Семь")
            8 -> println("Восемь")
            9 -> println("Девять")
            else -> println("Ошибка: Введите цифру от 0 до 9.")
        }
    }
    catch(e: Exception) {
        println("Ошибка: ${e.message}. Пожалуйста, введите корректное число.")
    }
}