package easy.e371

object Solution {
  def getSum(a: Int, b: Int): Int = {
    if (a == 0) {
      b
    } else if (b == 0) {
      a
    } else {
      val c = (a & b) << 1
      val d = a ^ b
      getSum(d, c)
    }
  }
}
