package easy.e292

object Solution {
  def canWinNim(n: Int): Boolean = {
    val b = n - 1
    if ((b % 4) == 0) {
      return true
    }
    if ((b - 1) % 4 == 0) {
      return true
    }
    if ((b - 2) % 4 == 0) {
      return true
    }
    false
  }
}
