package easy.e521

object Solution {
  def findLUSlength(a: String, b: String): Int = {
    if (a == b) -1
    else {
      math.max(a.length, b.length)
    }
  }
}
