package easy.e706

import org.scalatest._

class MyHashMapSpec extends FlatSpec with Matchers {
  "The MyHashMap" should "be 1" in {
    val hashMap: MyHashMap = new MyHashMap()
    hashMap.put(1, 1)
    hashMap.put(2, 2)
    hashMap.get(1) should be(1) // returns 1
    hashMap.get(3) should be(-1) // returns -1 (not found)
    hashMap.put(2, 1) // update the existing value
    hashMap.get(2) should be(1) // returns 1
    hashMap.remove(2) // remove the mapping for 2
    hashMap.get(2) should be(-1) // returns -1 (not found)
  }
}
