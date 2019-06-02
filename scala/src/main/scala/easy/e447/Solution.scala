package easy.e447

object Solution {
  def numberOfBoomerangs(points: Array[Array[Int]]): Int = {
    var count = 0
    for (j <- points.indices) {
      val distances = collection.mutable.Map.empty[Int, Int]
      for (k <- points.indices) {
        if (j != k) {
          val jPoint = points(j)
          val kPoint = points(k)

          val x = jPoint.head - kPoint.head
          val y = jPoint.last - kPoint.last
          val distance = x * x + y * y

          if (distances contains distance) {
            val d = distances(distance)
            count += d * 2
            distances(distance) += 1
          } else {
            distances += distance -> 1
          }
        }
      }
    }
    count
  }
}
