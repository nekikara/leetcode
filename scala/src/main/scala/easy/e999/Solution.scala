package easy.e999

object Solution {
  def numRookCaptures(board: Array[Array[Char]]): Int = {
    var rookPosition: (Int, Int) = (-1, -1)
    for (i <- 0 to 7) {
      for (j <- 0 to 7) {
        val cell: Char = board(i)(j)
        if (cell == 'R') {
          rookPosition = (i, j)
        }
      }
    }
    var u = true
    var r = true
    var d = true
    var l = true
    var count = 0
    var progress = 1
    while(u || r || d || l) {
      // Up
      if (u) {
        val up = (rookPosition._1 - progress, rookPosition._2)
        if (up._1 >= 0) {
          val upCell = board(up._1)(up._2)
          if (upCell == 'p') {
            count += 1
            u = false
          }
          if (upCell != '.') {
            u = false
          }
        } else {
          u = false
        }
      }

      // Right
      if (r) {
        val right = (rookPosition._1, rookPosition._2 + progress)
        if (right._2 <= 7) {
          val rightCell = board(right._1)(right._2)
          if (rightCell == 'p') {
            count += 1
            r = false
          }
          if (rightCell != '.') {
            r = false
          }
        } else {
          r = false
        }
      }

      // Down
      if (d) {
        val down = (rookPosition._1 + progress , rookPosition._2)
        if (down._1 <= 7) {
          val downCell = board(down._1)(down._2)
          if (downCell == 'p') {
            count += 1
            d = false
          }
          if (downCell != '.') {
            d = false
          }
        } else {
          d = false
        }
      }

      // Left
      if (l) {
        val left = (rookPosition._1 , rookPosition._2 - progress)
        if (left._2 >= 0) {
          val leftCell = board(left._1)(left._2)
          if (leftCell == 'p') {
            count += 1
            l = false
          }
          if (leftCell != '.') {
            l = false
          }
        } else {
          l = false
        }
      }
      progress += 1
    }
    count
  }
}
