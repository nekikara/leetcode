package easy.e812

object Solution {
  def largestTriangleArea(points: Array[Array[Int]]): Double = {
    var ans: Double = -1
    val edges = collection.mutable.Map[(Array[Int], Array[Int]), Double]()

    val N = points.length
    for (i <- 0 until N - 2) {
      for (j <- i + 1 until N - 1) {
        for (k <- j + 1 until N) {
          val x = points(i)
          val y = points(j)
          val z = points(k)
          val aKey = (x, y)
          val a = makeEdge(x, y, edges)
          val bKey = (y, z)
          val b = makeEdge(y, z, edges)
          val cKey = (z, x)
          val c = makeEdge(z, x, edges)

          val s = (a + b + c) / 2
          val S = math.sqrt(s * (s - a) * (s - b) * (s - c))
          if (ans < S) {
            ans = S
          }
        }
      }
    }
    ans
  }

  def makeEdge(
    x: Array[Int],
    y: Array[Int],
    edges: collection.mutable.Map[(Array[Int], Array[Int]), Double]
  ): Double = {

    val key = (x, y)
    if (edges contains key) {
      edges(key)
    } else {
      val edge = math.sqrt(math.pow(x(0) - y(0), 2) + math.pow(x(1) - y(1), 2))
      edges += key -> edge
      edge
    }
  }
}
