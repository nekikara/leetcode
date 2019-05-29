package easy.e824

object Solution {
  def toGoatLatin(S: String): String = {
    S.split(" ")
      .zipWithIndex
      .map(pair => {
        val as = for (i <- 1 to (1 + pair._2)) yield { 'a' }
        val s = pair._1
        val changed =
          if (Array('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o',
                'u') contains s(0)) {
            s + "ma"
          } else {
            s.tail + s.head.toString + "ma"
          }
        changed + as.mkString("")
      })
      .mkString(" ")
  }
}
