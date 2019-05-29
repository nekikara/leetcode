package easy.e908

object Solution {
  def smallestRangeI(A: Array[Int], K: Int): Int = {
    var min = A(0)
    var max = A(0)

    A.foreach(a => {
      min = scala.math.min(a, min)
      max = scala.math.max(a, max)
    })

    scala.math.max(0, max - min - 2 * K)
  }
}
