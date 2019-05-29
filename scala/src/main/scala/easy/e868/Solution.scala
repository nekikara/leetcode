package easy.e868

object Solution {
  def binaryGap(N: Int): Int = {
    val a = collection.mutable.MutableList[Int]()
    gap(N.toBinaryString, 0, a, -1)
    if (0 < a.length) {
      a.max
    } else {
      0
    }
  }

  def gap(binary: String, index: Int, ans: collection.mutable.MutableList[Int], started: Int): Unit = {
    if (binary.length <= index) {
      ()
    } else if (binary(index) == '1') {
      if (started != -1) {
        ans += index - started
      }
      gap(binary, index + 1, ans, index)
    } else {
      gap(binary, index + 1, ans, started)
    }
  }
}
