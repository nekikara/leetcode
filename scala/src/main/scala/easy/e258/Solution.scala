package easy.e258

object Solution {
  def addDigits(num: Int): Int = {
    (num - 1) % 9 + 1
  }
}
