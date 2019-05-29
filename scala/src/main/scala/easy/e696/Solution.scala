package easy.e696

object Solution {
  def countBinarySubstrings(s: String): Int = {
    val group = collection.mutable.MutableList[Int]()
    var now = s(0)
    var counter = 1

    for (i <- 1 until s.length) {
      val c = s(i)
      if (now == c) {
        counter += 1
      } else {
        group += counter
        now = c
        counter = 1
      }
    }
    group += counter

    var count = 0
    for (i <- 0 until group.length - 1) {
      val diff = Array(group(i), group(i + 1)).min
      count += diff
    }

    count
  }
}
