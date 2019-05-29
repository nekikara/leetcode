package easy.e985

object Solution {
  def sumEvenAfterQueries(A: Array[Int], queries: Array[Array[Int]]): Array[Int] = {
    val ans = collection.mutable.MutableList[Int]()
    var count = 0
    A.foreach(n => {
      if (n %2 == 0) {
        count += n
      }
    })
    for (i <- A.indices) {
      val v = queries(i)(0)
      val index = queries(i)(1)
      val old = A(index)
      A(index) += v
      if (old % 2 == 0) {
        count -= old
      }
      if ((old + v) % 2 == 0) {
        count += old + v
      }
      ans += count
    }
    ans.toArray
  }
}
