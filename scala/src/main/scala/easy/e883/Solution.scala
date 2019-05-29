package easy.e883

object Solution {
  def projectionArea(grid: Array[Array[Int]]): Int = {
    var top = 0
    for (elem <- grid) {
      top += elem.count(n => n > 0)
    }
    val front = grid.map(a => a.max).sum

    var side = 0

    for (i <- grid(0).indices) {
      side += grid.map(cell => cell(i)).max
    }

    top + front + side
  }
}
