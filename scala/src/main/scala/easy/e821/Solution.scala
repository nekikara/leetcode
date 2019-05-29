package easy.e821

object Solution {

  def shortestToChar(S: String, C: Char): Array[Int] = {
    val indices = collection.mutable.MutableList[Int]()
    for (i <- S.indices) {
      if (C == S(i)) {
        indices += i
      }
    }

    val ans = collection.mutable.MutableList[Int]()
    for (i <- S.indices) {
      val s = S(i)
      if (C == s) {
        ans += 0
      } else {
        val min = indices.map(n => {
          val x = (n - i).abs
          x
        }).min
        ans += min
      }
    }
    ans.toArray
  }

}
