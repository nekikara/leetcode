package easy.e171

object Solution {
  def titleToNumber(s: String): Int = {
    var mul = 1
    var ans = 0
    for (i <- s.length - 1 to 0 by -1) {
      ans += mul * (s(i) - 64)
      mul *= 26
    }
    ans
  }
  def titleToNumber2(s: String): Int = {
    val x = for (i <- s.indices) yield {
      val index = s.length - 1 - i
      val c = s(index)
      val n = c - 64
      val power = math.pow(26, i).toInt
      power * n
    }
    x.sum
  }
}
