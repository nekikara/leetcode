package easy.e463

object Solution {
  def islandPerimeter(grid: Array[Array[Int]]): Int = {
    grid.zipWithIndex.map(p1 => {
      val row = p1._1
      val i = p1._2
      row.zipWithIndex.map(p2 => {
        val cell = p2._1
        val j = p2._2

        if (cell == 1) {
          Array((1, 0), (0, 1), (-1, 0), (0, -1)).map(around => {
            val y = i + around._1
            val x = j + around._2
            if (0 <= x && 0 <= y && x < grid(0).length && y < grid.length) {
              val c = grid(y)(x)
              if (c == 1) {
                0
              } else {
                1
              }
            } else {
              1
            }
          }).sum

        } else {
          0
        }
      }).sum
    }).sum
  }
}
