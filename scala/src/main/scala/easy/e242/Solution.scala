package easy.e242

object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    if (s.length != t.length) {
      return false
    }
    val table = new Array[Int](26)
    s.foreach(c => {
      table(c - 'a') += 1
    })
    checkAnagram(t, 0, table)
  }

  def checkAnagram(t: String, index: Int, table: Array[Int]): Boolean = {
    if (t.length <= index) {
      true
    } else {
      table(t(index) - 'a') -= 1

      if (table(t(index) - 'a') < 0) {
        false
      } else {
        checkAnagram(t, index + 1, table)
      }
    }
  }
}
