package easy.e349

object Solution {
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val coll = collection.mutable.Set[Int]()

    for (n <- nums1.indices) {
      val x = nums1(n)
      if (nums2 contains x) {
        coll += x
      }
    }
    coll.toArray
  }
}
