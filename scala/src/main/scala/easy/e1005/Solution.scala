package easy.e1005

object Solution {
  def largestSumAfterKNegations(A: Array[Int], K: Int): Int = {
    (1 to K).foreach(i => {
      val min = A.min

      val index = A.indexOf(min)
      A(index) = A(index) * -1
    })
    println(A.mkString(", "))
    A.sum
  }
}
