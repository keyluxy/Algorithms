package massive

/**
 * В школе прошёл экзамен по математике.
 * Некоторые ученики списали решения, были замечены и получили 0 баллов.
 * Помогите учителю пересортировать оценки учеников.
 * Все оценки, равные 0, должны быть перемещены в конец списка, при этом порядок остальных оценок должен остаться неизменным.
 *
 * Формат выходных данных
 * На выходе программа должна вывести строку из N элементов массива, где все нули перемещены в конец, а порядок остальных чисел сохранён.
 * Значения разделяются пробелами.
 * Пример 1
 * Входные данные
 *
 * 6
 * 0 0 6 0 9 8
 *
 * Выходные данные
 *
 * 6 9 8 0 0 0
 *
 *
 */

class CheatingAtSchool {
    fun solution(num: Int, arr: Array<Int>): String {

        var noZero = 0
        var i = 0

        while (i < num) {
            if (arr[i] != 0) {
                var tmp = arr[noZero]
                arr[noZero] = arr[i]
                arr[i] = tmp

                noZero++
            }
            i++
        }

        return arr.joinToString(" ")
    }

}

fun main() {
    val solver = CheatingAtSchool()

    // Тест из условия задачи
    val arr1 = arrayOf(0, 0, 6, 0, 9, 8)
    val result1 = solver.solution(6, arr1)
    println("Вход: 0 0 6 0 9 8")
    println("Выход: $result1")
    println()
/*
    // Дополнительные тесты
    val arr2 = arrayOf(1, 2, 0, 3, 0, 4)
    val result2 = solver.solution(6, arr2)
    println("Вход: 1 2 0 3 0 4")
    println("Выход: $result2")
    println()

    val arr3 = arrayOf(0, 0, 0, 1, 2, 3)
    val result3 = solver.solution(6, arr3)
    println("Вход: 0 0 0 1 2 3")
    println("Выход: $result3")
    println()

    val arr4 = arrayOf(1, 2, 3, 4, 5, 6)
    val result4 = solver.solution(6, arr4)
    println("Вход: 1 2 3 4 5 6")
    println("Выход: $result4")
    println()

    val arr5 = arrayOf(0, 0, 0, 0, 0, 0)
    val result5 = solver.solution(6, arr5)
    println("Вход: 0 0 0 0 0 0")
    println("Выход: $result5")

 */
}