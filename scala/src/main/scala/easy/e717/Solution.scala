package easy.e717

object Solution {
  def isOneBitCharacter(bits: Array[Int]): Boolean = {
    val len = bits.length
    if (len == 1) {
      true
    } else {
      val count = oneConsecutive(bits, len - 2, 0)
      count % 2 == 0
    }
  }

  def oneConsecutive(ints: Array[Int], i: Int, count: Int): Int = {
    if (i < 0) {
      return count
    }
    val n = ints(i)
    if (n == 0) {
      count
    } else {
      oneConsecutive(ints, i - 1, count + 1)
    }
  }
}
