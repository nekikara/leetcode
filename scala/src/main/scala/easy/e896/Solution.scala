package easy.e896

object Solution {
  def isMonotonic(A: Array[Int]): Boolean = {
    val N = A.length
    val tend =
      collection.mutable.Map("dec" -> false, "eq" -> false, "inc" -> false)
    val ans = loop(A, N, 1, tend)
    //println("   end   ")
    ans
  }

  def loop(A: Array[Int],
           N: Int,
           index: Int,
           tend: collection.mutable.Map[String, Boolean]): Boolean = {
    //println(s"index: $index, compared: $compared")

    if (N == index) {
      return true
    }
    val currCompared = compare(A, index)
    tend(currCompared) = true
    if (tend("dec") && tend("inc")) {
      false
    } else {
      loop(A, N, index + 1, tend)
    }
  }

  def compare(A: Array[Int], index: Int): String = {
    val curr = A(index)
    val pre = A(index - 1)
    if (curr < pre) {
      "dec"
    } else if (curr == pre) {
      "eq"
    } else {
      "inc"
    }
  }

}
