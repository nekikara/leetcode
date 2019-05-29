package easy.e884

object Solution {
  def uncommonFromSentences(A: String, B: String): Array[String] = {
    val concat = A + " " + B
    val map = collection.mutable.Map[String, Int]()
    concat.split(" ").foreach(s => {
      if (map contains s) {
        map(s) += 1
      } else {
        map(s) = 1
      }
    })
    map.filter(m => m._2 == 1).keys.toArray
  }
}
