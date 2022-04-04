package task1

import task1.algorythms.IBaseAlgorithm
import task1.algorythms.SortByMax
import task1.algorythms.SortByMin
import task1.algorythms.SortBySum

fun main(args: Array<String>) {

    val mx1 = Matrix(
        arrayOf(
            arrayOf(5, -5, 8),
            arrayOf(0, 7, 6),
            arrayOf(-6, 2, 3),
            arrayOf(12, 2, 1),
            arrayOf(7, 9, -4)
        )
    )

    printMatrix(mx1)

    var algorithm: IBaseAlgorithm = SortByMax()
    var desc: Boolean

    while (true) {

        println("Выберите алгоритм сортировки:")
        println("1/10 - по возрастанию/убыванию сумм элементов строк матриц")
        println("2/20 - по возрастанию/убыванию максимального элемента в строке матриц")
        println("3/30 - по возрастанию/убыванию минимального элемента в строке матриц")

        var userAnswer = readLine()?.toIntOrNull() ?: continue

        desc = userAnswer % 10 == 0
        userAnswer = if (desc) userAnswer / 10 else userAnswer % 10
        when (userAnswer) {
            1 -> { algorithm = SortBySum() }
            2 -> { algorithm = SortByMax() }
            3 -> { algorithm = SortByMin() }
        }
        algorithm.sortWithAlgorithm(mx1, desc)
        printMatrix(mx1)
    }



}

fun printMatrix(matrix: Matrix) {
    matrix.userData.forEach { row ->
        row.forEach { element -> print("$element ") }
        println()
    }
}