package easy.e1030

object Solution {
  def allCellsDistOrder(R: Int, C: Int, r0: Int, c0: Int): Array[Array[Int]] = {

    val l = collection.mutable.MutableList[(Int, Array[Int])]()

    for (r <- 0 until R) {
      for (c <- 0 until C) {
        val distance = (r0 - r).abs + (c0 - c).abs
        val cor = Array[Int](r, c)
        val item: (Int, Array[Int]) = (distance, cor)
        l += item
      }
    }

    l.sortWith(_._1 < _._1).map(_._2).toArray
  }
}
