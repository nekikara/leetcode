package easy.e806

object Solution {
  def numberOfLines(widths: Array[Int], S: String): Array[Int] = {
    val ans = collection.mutable.MutableList[Int]()
    val aIndex = 97
    var line = 1

    S.foreach(c => {
      val unit = widths(c - aIndex)
      if (line <= ans.length) {
        if (100 < (ans(line - 1) + unit)) {
          line += 1
          ans += unit
        } else {
          ans(line - 1) += unit
        }
      } else {
        ans += unit
      }
    })
    Array(ans.length, ans.last)
  }
}
