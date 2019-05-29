package easy.e344

object Solution {

  def reverseString(s: Array[Char]): Unit = {
    var start = 0
    var end = s.length - 1

    while (start < end) {
      val tmp = s(start)
      s(start) = s(end)
      s(end) = tmp
      start += 1
      end -= 1
    }

    //val ans = s.mkString("\",\"")
    //print("[\"")
    //print(s"$ans")
    //println("\"]")
  }

}
