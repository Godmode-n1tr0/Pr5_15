fun main(){
    try{
        print("Введите число a: ");
        val a = readln(). toInt();
        print("Введите число в: ");
        val b = readln().toInt();
        when {
            a == b -> {
                val result = a*a*a;
                println("Числа равны. Первое число в 3-й степени: $result")
            }
            a > b -> {
                println("Большее число: $a")
                println("Увеличиваем его на 1: ${a + 1}")
            }
            else -> {
                println("Большее число: $b")
                println("Увеличиваем его на 1: ${b + 1}")
            }
        }
    }
    catch(e: Exception) {
        println("Ошибка: ${e.message}. Пожалуйста, введите корректное число.")
    }
}