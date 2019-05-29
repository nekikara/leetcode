package easy.e892

object Solution {
  def surfaceArea(grid: Array[Array[Int]]): Int = {
    val N = grid.length
    loop(grid, 0, 0, N)
  }

  def loop(grid: Array[Array[Int]], y: Int, x: Int, N: Int): Int = {
    if (y < N && x < N) {
      val cell = grid(y)(x)

      val upBottom = 2 * (if (cell == 0) 0 else 1)
      val left = xSide(grid, x, y, N, cell, -1)
      val right = xSide(grid, x, y, N, cell, 1)
      val north = ySide(grid, x, y, N, cell, -1)
      val south = ySide(grid, x, y, N, cell, 1)

      south + north + right + left + upBottom + loop(grid, y, x + 1, N)
    } else if (y < N && N <= x) {
      loop(grid, y + 1, 0, N)
    } else {
      0
    }
  }

  def xSide(grid: Array[Array[Int]],
            x: Int,
            y: Int,
            N: Int,
            value: Int,
            diffX: Int): Int = {
    if ((x == 0 && diffX == -1) ||
        (x == N - 1 && diffX == 1)) {
      return grid(y)(x)
    }

    val target = if (diffX < 0) {
      grid(y)(x - 1)
    } else {
      grid(y)(x + 1)
    }
    if (target < value) {
      value - target
    } else {
      0
    }
  }
  def ySide(grid: Array[Array[Int]],
            x: Int,
            y: Int,
            N: Int,
            value: Int,
            diffY: Int): Int = {
    if ((y == 0 && diffY == -1) ||
        (y == N - 1 && diffY == 1)) {
      return grid(y)(x)
    }

    val target = if (diffY < 0) {
      grid(y - 1)(x)
    } else {
      grid(y + 1)(x)
    }
    if (target < value) {
      value - target
    } else {
      0
    }
  }
}
