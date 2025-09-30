package massive

/**
 *
 * Задача на два указателя
 *
 *
 * (two pointers)
 * Дано:
 *
 * • массив целых чисел, отсортированных
 * по возрастанию,
 *
 * • некоторое число sum.
 *
 * Задача: написать функцию, которая возвращает
 * два числа из заданного массива, в сумме
 * дающие sum. Если таких двух чисел в массиве
 * нет, должно возвращаться null.
 *
 * Ограничение: в массиве может быть только
 * одна пара чисел, которая соответствует
 * условию.
 *
 */

class TwoPointers {
    fun solution(arr: Array<Int>, sum: Int): Pair<Int, Int>? {

        var left = 0
        var right = arr.size - 1

        while (left != right) {
            val tmp = arr[left] + arr[right]

            when {
                tmp == sum -> return Pair(arr[right], arr[left])
                tmp < sum -> left++
                else -> right--
            }
        }

        return null

    }
}

fun main() {
    val twoPointers = TwoPointers()

    val arr1 = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val sum1 = 8
    val result1 = twoPointers.solution(arr1, sum1)
    println("Массив: ${arr1.joinToString()}, сумма: $sum1")
    println("Результат: $result1")
    println()
}



