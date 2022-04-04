package task1

class Matrix(data: Array<Array<Int>>) {

    val userData = data.clone()
    val rows = data.size

    override fun hashCode(): Int {
        var result = userData.contentDeepHashCode()
        result = 31 * result + rows
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Matrix

        if (rows != other.rows) return false
        if (userData[0].size != other.userData[0].size) return false
        if (!userData.contentDeepEquals(other.userData)) return false

        return true
    }

}