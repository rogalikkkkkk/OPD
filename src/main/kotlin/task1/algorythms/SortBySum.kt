package task1.algorythms

import task1.Matrix

class SortBySum : IBaseAlgorithm {
    override fun sortWithAlgorithm(matrix: Matrix, descending: Boolean) {
        sortingAlgorithm(matrix, descending, ::sum)
    }

    private fun sum (row: Array<Int>): Int {
        return row.sum()
    }
}