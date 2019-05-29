package easy.e706

class MyHashMap() {

  /** Initialize your data structure here. */
  private var hash = collection.mutable.ListBuffer[(Int, Int)]()

  /** value will always be non-negative. */
  def put(key: Int, value: Int): Unit = {
    val index = searchIndex(key)
    if (index == -1) {
      val p = (key, value)
      hash += p
    } else {
      hash.update(index, (key, value))
    }
  }

  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  def get(key: Int): Int = {
    val index = searchIndex(key)
    if (index == -1) {
      -1
    } else {
      hash(index)._2
    }
  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  def remove(key: Int): Unit = {
    val index = searchIndex(key)
    if (index != -1) {
      hash -= hash(index)
    }
  }

  def searchIndex(key: Int): Int = {
    hash.indexWhere(p => p._1 == key)
  }

}

/**
  * Your MyHashMap object will be instantiated and called as such:
  * var obj = new MyHashMap()
  * obj.put(key,value)
  * var param_2 = obj.get(key)
  * obj.remove(key)
  */
