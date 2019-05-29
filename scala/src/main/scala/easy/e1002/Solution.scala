package easy.e1002

object Solution {

  def commonChars(A: Array[String]): List[String] = {
    var s = map(A(0))

    for (i <- 1 until A.length) {
      var t = map(A(i))
      s.keys.foreach(c => {
        if (t contains c) {
          if (s(c) > t(c)) {
            s += (c -> t(c))
          }
        } else {
          s -= c
        }
      })
    }
    val x = s.keys.map(c => {
      val nn = 0 until s(c) map(n => c.toString)
      nn.toList
    }).toList
    x.flatten
  }

  def map(s: String): Map[Char, Int] = {
    var m = Map[Char, Int]()
    s.foreach(c => {
      if (m contains c) {
        m = m + (c -> (m(c) + 1))
      } else {
        m = m + (c -> 1)
      }
    })
    m
  }

}
