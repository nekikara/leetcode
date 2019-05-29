package easy.e762

object Solution {
  def countPrimeSetBits(L: Int, R: Int): Int = {
    val primeNumbers = Array(2, 3, 5, 7, 11, 13, 17, 19)

    val seq = for (i <- L to R) yield {
      val count = i.toBinaryString.count(c => c == '1')
      if (primeNumbers contains count) {
        1
      } else {
        0
      }
    }
    seq.sum
  }
}
