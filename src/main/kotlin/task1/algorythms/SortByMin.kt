package task1.algorythms

import task1.Matrix

class SortByMin : IBaseAlgorithm {
    override fun sortWithAlgorithm(matrix: Matrix, descending: Boolean) {
        sortingAlgorithm(matrix, descending, ::min)
    }

    private fun min (row: Array<Int>): Int {
        return row.minOrNull()!!
    }
}