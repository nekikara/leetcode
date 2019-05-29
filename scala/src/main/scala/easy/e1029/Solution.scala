package easy.e1029

object Solution {
  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {
    val sorted = costs.sortWith((a, b) => {
      (a(0) - a(1)) < (b(0) - b(1))
    })
    val n = costs.length / 2

    val x = for (i <- 0 until n) yield {
      sorted(i)(0) + sorted(i + n)(1)
    }
    x.sum
  }
}
