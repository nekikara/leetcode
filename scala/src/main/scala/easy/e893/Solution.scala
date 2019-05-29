package easy.e893

object Solution {
  def numSpecialEquivGroups(A: Array[String]): Int = {
    val set = collection.mutable.Set[String]()
    A.foreach(s => {
      val odd = collection.mutable.MutableList[Char]()
      val even = collection.mutable.MutableList[Char]()
      s.zipWithIndex.foreach(p => {
        if (p._2 % 2 == 0) {
          even += p._1
        } else {
          odd += p._1
        }
      })

      val capture = odd.sorted.mkString + even.sorted.mkString
      set += capture
    })
    set.size
  }
}
