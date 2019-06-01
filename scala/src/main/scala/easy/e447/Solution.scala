package easy.e447

object Solution {
  def numberOfBoomerangs(points: Array[Array[Int]]): Int = {
    val max = points.length
    var count = 0

    for (j <- 0 until max - 1) {
      for (k <- j + 1 until max) {
        val jPoint = points(j)
        val kPoint = points(k)

        val halfX = (jPoint.head - kPoint.head).abs / 2.0
        val halfY = (jPoint.last - kPoint.last).abs / 2.0

        val halfPX =
          if (jPoint.head < kPoint.head) jPoint.head + halfX
          else jPoint.head - halfX
        val halfPY =
          if (jPoint.last < kPoint.last) jPoint.last + halfY
          else jPoint.last - halfY

        val halfPoint = Array(halfPX, halfPY)

        points.find(p => p sameElements halfPoint) match {
          case Some(_) => count += 2
          case None    => ()
        }
      }
    }
    count
  }
}
