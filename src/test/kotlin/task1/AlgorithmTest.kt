package task1

import org.junit.jupiter.api.Test
import task1.algorythms.IBaseAlgorithm
import task1.algorythms.SortByMax
import task1.algorythms.SortByMin
import task1.algorythms.SortBySum
import kotlin.test.assertEquals

class AlgorithmTest {

    var mx: Matrix = Matrix(
        arrayOf(
            arrayOf(5, -5, 8),
            arrayOf(0, 7, 6),
            arrayOf(-6, 2, 3),
            arrayOf(12, 2, 1),
            arrayOf(7, 9, -4)
        )
    )
    lateinit var pickedAlgorithm: IBaseAlgorithm

    @Test
    fun sortBySumTest() {
        pickedAlgorithm = SortBySum()
        val expectMatrix1 = Matrix(
            arrayOf(
                arrayOf(-6, 2, 3),
                arrayOf(5, -5, 8),
                arrayOf(7, 9, -4),
                arrayOf(0, 7, 6),
                arrayOf(12, 2, 1)
            )
        )
        val expectMatrix2 = Matrix(
            arrayOf(
                arrayOf(12, 2, 1),
                arrayOf(0, 7, 6),
                arrayOf(7, 9, -4),
                arrayOf(5, -5, 8),
                arrayOf(-6, 2, 3)
            )
        )

        pickedAlgorithm.sortWithAlgorithm(mx, false)
        assertEquals(mx, expectMatrix1)

        pickedAlgorithm.sortWithAlgorithm(mx, true)
        assertEquals(mx, expectMatrix2)
    }

    @Test
    fun sortByMaxTest() {
        pickedAlgorithm = SortByMax()
        val expectMatrix1 = Matrix(
            arrayOf(
                arrayOf(-6, 2, 3),
                arrayOf(0, 7, 6),
                arrayOf(5, -5, 8),
                arrayOf(7, 9, -4),
                arrayOf(12, 2, 1),
            )
        )
        val expectMatrix2 = Matrix(
            arrayOf(
                arrayOf(12, 2, 1),
                arrayOf(7, 9, -4),
                arrayOf(5, -5, 8),
                arrayOf(0, 7, 6),
                arrayOf(-6, 2, 3)
            )
        )

        pickedAlgorithm.sortWithAlgorithm(mx, false)
        assertEquals(mx, expectMatrix1)

        pickedAlgorithm.sortWithAlgorithm(mx, true)
        assertEquals(mx, expectMatrix2)
    }

    @Test
    fun sortByMinTest() {
        pickedAlgorithm = SortByMin()
        val expectMatrix1 = Matrix(
            arrayOf(
                arrayOf(-6, 2, 3),
                arrayOf(5, -5, 8),
                arrayOf(7, 9, -4),
                arrayOf(0, 7, 6),
                arrayOf(12, 2, 1)
            )
        )
        val expectMatrix2 = Matrix(
            arrayOf(
                arrayOf(12, 2, 1),
                arrayOf(0, 7, 6),
                arrayOf(7, 9, -4),
                arrayOf(5, -5, 8),
                arrayOf(-6, 2, 3)
            )
        )

        pickedAlgorithm.sortWithAlgorithm(mx, false)
        assertEquals(mx, expectMatrix1)

        pickedAlgorithm.sortWithAlgorithm(mx, true)
        assertEquals(mx, expectMatrix2)
    }


}