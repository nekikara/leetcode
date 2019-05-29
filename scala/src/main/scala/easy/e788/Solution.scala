package easy.e788

object Solution {
  def rotatedDigits(N: Int): Int = {
    var x = 0

    (1 to N).foreach(n => {
      val strN = n.toString
      val rotatedD = strN.map(c => {
        val d = c.toString.toInt
        rotateDigit(d)
      })
      val invalids = rotatedD.filter(_ == -1)
      if (invalids.isEmpty) {
        val rotated = rotatedD.mkString.toInt
        if (rotated != n) {
          x += 1
        }
      }
    })

    x
  }

  def rotateDigit(N: Int): Int = {
    N match {
      case 0 | 1 | 8 => N
      case 2         => 5
      case 5         => 2
      case 6         => 9
      case 9         => 6
      case _         => -1
    }
  }
}
