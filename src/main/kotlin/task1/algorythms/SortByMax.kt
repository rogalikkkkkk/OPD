package task1.algorythms

import task1.Matrix

class SortByMax : IBaseAlgorithm {
    override fun sortWithAlgorithm(matrix: Matrix, descending: Boolean) {
        sortingAlgorithm(matrix, descending, ::max)
    }

    private fun max (row: Array<Int>): Int {
        return row.maxOrNull()!!
    }
}