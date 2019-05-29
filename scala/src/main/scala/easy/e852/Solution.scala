package easy.e852

object Solution {
  def peakIndexInMountainArray(A: Array[Int]): Int = {
    var max = -1
    var index = 0
    for (i <- 0 to A.length - 1) {
      val n = A(i)
      if (max < n) {
        max = n
        index = i
      }
    }
    index
  }
}
