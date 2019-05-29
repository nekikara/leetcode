package easy.e693

object Solution {
  def hasAlternatingBits(n: Int): Boolean = {
    val bi = n.toBinaryString
    val count = bi.length
    var ans = true
    var stock = bi(0)

    for (i <- 1 until count) {
      val c = bi(i)
      if (ans && stock == '1' && c == '0') {
        ans = true
      } else if (ans && stock == '0' && c == '1') {
        ans = true
      } else {
        ans = false
      }
      stock = c
    }
    ans
  }
}
