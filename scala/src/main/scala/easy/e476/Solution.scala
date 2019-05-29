package easy.e476

object Solution {
  def findComplement(num: Int): Int = {
    val x = num.toBinaryString.map(b => {
      b match {
        case '0' => '1'
        case '1' => '0'
      }
    }).mkString

    Integer.parseInt(x, 2)
  }
}
