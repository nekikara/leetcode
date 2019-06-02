package easy.e383

object Solution {
  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    val ransomA = analyze(ransomNote)
    val magazineA = analyze(magazine)
    var result = true

    ransomA.foreach(ransomP => {
      if (magazineA contains ransomP._1) {
        magazineA(ransomP._1) -= ransomP._2
      } else {
        result = false
      }
    })
    val minus = magazineA.find(p => p._2 < 0) match {
      case None    => true
      case Some(_) => false
    }

    result && minus
  }

  def analyze(str: String): collection.mutable.Map[Char, Int] = {
    val coll = collection.mutable.Map.empty[Char, Int]
    str.foreach(c => {
      if (coll contains c) {
        coll(c) += 1
      } else {
        coll += c -> 1
      }
    })

    coll
  }
}
