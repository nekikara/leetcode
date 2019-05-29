package easy.e1009

object Solution {
  def bitwiseComplement(N: Int): Int = {
    val binary = N.toBinaryString

    binary.map(p => {
      if (p == '0') 1
      else 0
    }).reverse
      .zipWithIndex
      .map(p => {
        if (p._2 == 0) p._1
        else p._1 * math.pow(2, p._2)
      }).sum.toInt
  }
}
