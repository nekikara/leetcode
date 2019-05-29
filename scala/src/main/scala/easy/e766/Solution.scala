package easy.e766

object Solution {
  def isToeplitzMatrix(matrix: Array[Array[Int]]): Boolean = {
    val m = matrix.length
    val n = matrix(0).length
    val set = (0 to m - 1 + n).map(_ => collection.mutable.Set[Int]())
    for (i <- matrix.indices) {
      for (j <- matrix(0).indices) {
        val index = (m - 1 - i) + j
        set(index) += matrix(i)(j)
      }
    }

    set.count(s => s.size == 1) == (n + m - 1)
  }
}
