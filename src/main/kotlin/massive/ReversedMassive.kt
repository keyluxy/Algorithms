package massive

/**
 * ДВА УКАЗАТЕЛЯ
 *
 * Задача на разворот
 * массива
 *
 * Дано: массив целых чисел.
 *
 * Задача: развернуть массив, то есть вывести его
 * в обратном порядке.
 *
 * Ограничение: линейное время без
 * дополнительных аллокаций памяти.
 *
 * 2 7 8 9 11 12 16 21
 *
 * 21 16 12 11 9 8 7 2
 */

class ReversedMassive {
    fun solution(arr: Array<Int>): Array<Int> {

        var left = 0
        var right = arr.size - 1

        while (left < right) {
            val tmp = arr[left]
            arr[left] = arr[right]
            arr[right] = tmp

            left++
            right--
        }

        return arr

    }
}

fun swap(arr: Array<Int>, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

fun main() {
    val reverse = ReversedMassive()
    val arr1 = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val result1 = reverse.solution(arr1)
    println("Массив: ${result1.joinToString()}") // Массив: 7, 6, 5, 4, 3, 2, 1
}



