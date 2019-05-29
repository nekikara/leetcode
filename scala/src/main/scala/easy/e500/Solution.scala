package easy.e500

object Solution {
  def findWords(words: Array[String]): Array[String] = {
    val ans = collection.mutable.MutableList[String]()

    words.foreach(word => {
      val lines = collection.mutable.Set[Int]()
      word.foreach(c => {
        lines += charToLine(c)
      })
      if (lines.size == 1) ans += word
    })
    ans.toArray
  }

  def charToLine(c: Char): Int = {
    c match {
      case 'Q' | 'W' | 'E' | 'R' | 'T' | 'Y' | 'U' | 'I' | 'O' | 'P' | 'q' | 'w' | 'e' | 'r' | 't' | 'y' | 'u' | 'i' | 'o' | 'p' => 1
      case 'A' | 'S' | 'D' | 'F' | 'G' | 'H' | 'J' | 'K' | 'L' | 'a' | 's' | 'd' | 'f' | 'g' | 'h' | 'j' | 'k' | 'l'  => 2
      case 'Z' | 'X' | 'C' | 'V' | 'B' | 'N' | 'M' | 'z' | 'x' | 'c' | 'v' | 'b' | 'n' | 'm' => 3
    }
  }
}
