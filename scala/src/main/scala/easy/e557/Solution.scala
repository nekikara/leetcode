package easy.e557

object Solution {
  def reverseWords(s: String): String = {
    val sp = s.split(" ")
    sp.map(sps => sps.reverse).mkString(" ")
  }

}
