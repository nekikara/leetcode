package easy.e389

object Solution {
  def findTheDifference(s: String, t: String): Char = {
    val map = collection.mutable.Map.empty[Char, Int]
    s.foreach(c => {
      if (!(map contains c)) {
        map += c -> 1
      } else {
        map(c) += 1
      }
    })
    var ans = '1'
    t.foreach(c => {
      if (map contains c) {
        if (map(c) == 0) {
          map -= c
          ans = c
        } else {
          map(c) -= 1
        }
      } else {
        ans = c
      }
    })
    ans
  }
}
