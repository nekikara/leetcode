package easy.e888

object Solution {
  def fairCandySwap(A: Array[Int], B: Array[Int]): Array[Int] = {
    val sumA = A.sum
    val sumB = B.sum
    val checkVal = (sumB - sumA) / 2

    val bSet = B.toSet
    returnAB(A, 0, checkVal, bSet)
  }

  def returnAB(A: Array[Int],
               index: Int,
               checkVal: Int,
               bSet: Set[Int]): Array[Int] = {
    if (A.length <= index) {
      Array(0, 0)
    } else {
      val b = A(index) + checkVal
      if (bSet contains (A(index) + checkVal)) {
        Array(A(index), b)
      } else {
        returnAB(A, index + 1, checkVal, bSet)
      }
    }

  }
}
