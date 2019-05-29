package easy.e953

object Solution {
  def isAlienSorted(words: Array[String], order: String): Boolean = {
    val max = words.maxBy(_.size).size
    isCharsSorted(words, order, 0, max)
  }

  def isCharsSorted(words: Array[String],
                    order: String,
                    index: Int,
                    max: Int): Boolean = {
    if (max <= index) {
      return true
    }
    val indices = words.map(word => {
      if (word.length <= index) {
        -1
      } else {
        order.indexOf(word(index))
      }
    })
    if (indices.toSet.size == 1) {
      return isCharsSorted(words, order, index + 1, max)
    }
    if (indices.sameElements(indices.sorted)) {
      if (indices.toSet.size == words.length) {
        true
      } else {
        isCharsSorted(words, order, index + 1, max)
      }
    } else {
      false
    }
  }
}
