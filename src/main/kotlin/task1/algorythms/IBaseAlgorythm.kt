package task1.algorythms

import task1.Matrix

interface IBaseAlgorithm {

    fun sortWithAlgorithm(matrix: Matrix, descending: Boolean)

    fun sortingAlgorithm(matrix: Matrix, descending: Boolean, function: (Array<Int>) -> Int) {

        var swap = true
        while(swap){
            swap = false
            for(i in 0 until matrix.rows - 1){
                if( (function(matrix.userData[i]) > function(matrix.userData[i + 1]) && !descending) ||
                    (function(matrix.userData[i]) < function(matrix.userData[i + 1]) && descending)){
                    val temp = matrix.userData[i]
                    matrix.userData[i] = matrix.userData[i + 1]
                    matrix.userData[i + 1] = temp
                    swap = true
                }
            }
        }

    }
}