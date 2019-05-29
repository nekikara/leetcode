package easy.e1051

object Solution {
  def heightChecker(heights: Array[Int]): Int = {
    val sorted = heights.sorted
    var count = 0
    sorted.zipWithIndex.foreach(p => {
      val h = heights(p._2)
      if (h != p._1) {
        count += 1
      }
    })
    count
  }
}
