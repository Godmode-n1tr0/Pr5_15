fun main() {
    try {
        println("Введите ваш возраст:")
        val ageInput = readLine()

        val age = ageInput?.toInt() ?: throw IllegalArgumentException("Некорректный ввод. Ожидался возраст в числовом формате.")

        when {
            age in 0..2 -> println("Младенец")
            age in 3..6 -> println("Ребёнок")
            age in 7..12 -> println("Подросток")
            age in 13..19 -> println("Юноша / Девушка")
            age in 20..35 -> println("Молодой человек / Молодая девушка")
            age in 36..59 -> println("Взрослый человек")
            age in 60..120 -> println("Пожилой человек")
            else -> println("Ошибка: Введите корректный возраст.")
        }

    } catch (e: NumberFormatException) {
        println("Ошибка: некорректный ввод. Ожидался возраст в числовом формате.")
    } catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    } catch (e: Exception) {
        println("Произошла неожиданная ошибка: ${e.message}")
    }
}