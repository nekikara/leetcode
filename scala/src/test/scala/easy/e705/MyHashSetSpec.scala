package easy.e705

import org.scalatest._

class MyHashSetSpec extends FlatSpec with Matchers {
  "The MyHashSet" should "process as HashSet 1" in {
    val hashSet = new MyHashSet()
    hashSet.add(1)
    hashSet.add(2)
    hashSet.contains(1) should be(true) // returns true
    hashSet.contains(3) should be(false) // returns false (not found)
    hashSet.add(2)
    hashSet.contains(2) should be(true) // returns true
    hashSet.remove(2)
    hashSet.contains(2) should be(false)
  }
}
