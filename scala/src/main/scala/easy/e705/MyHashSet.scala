package easy.e705

class MyHashSet() {

  /** Initialize your data structure here. */
  val map = collection.mutable.Map.empty[Int, Boolean]

  def add(key: Int): Unit = {
    if (!(map contains key)) {
      map += key -> true
    }
  }

  def remove(key: Int): Unit = {
    if (map contains key) {
      map -= key
    }
  }

  /** Returns true if this set contains the specified element */
  def contains(key: Int): Boolean = {
    map contains key
  }

}
