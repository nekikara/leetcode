package easy.e520

object Solution {
  def detectCapitalUse(word: String): Boolean = {
    val first = word.head
    if (word.length == 1) {
      return true
    }
    if (first.isLower) {
      word.forall(c => c.isLower)
    } else {
      val second = word(1)
      if (1 < word.length && second.isLower) {
        val x: Seq[Boolean] = for (i <- 1 until word.length) yield {
          word(i).isLower
        }
        x.forall(b => b)
      } else {
        word.forall(_.isUpper)
      }
    }
  }
}
