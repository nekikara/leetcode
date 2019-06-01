package easy.e387

object Solution {
  def firstUniqChar(s: String): Int = {
    val count = collection.mutable.Map.empty[Char, Int]
    val indices = collection.mutable.Map.empty[Char, Int]
    val max = s.length

    traverse(s, 0, count, indices, max)

    val once = count.filter(c => c._2 == 1)
    val onceKeys: List[Char] = once.keys.toList
    val onces = indices.filter(k => onceKeys.contains(k._1))
    if (once.isEmpty) {
      -1
    } else {
      onces.minBy(p => p._2)._2
    }
  }

  def traverse(s: String,
               index: Int,
               count: collection.mutable.Map[Char, Int],
               indices: collection.mutable.Map[Char, Int],
               max: Int): Unit = {
    if (index < max) {
      val c = s(index)

      if (count contains c) {
        count(c) += 1
      } else {
        count += c -> 1
      }

      if (!(indices contains c)) {
        indices += c -> index
      }
      traverse(s, index + 1, count, indices, max)
    }
  }
}
