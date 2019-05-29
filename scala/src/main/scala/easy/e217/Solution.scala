package easy.e217

object Solution {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    val map = collection.mutable.Map.empty[Int, Int]
    duplicate(nums, 0, map)
  }

  def duplicate(nums: Array[Int],
                index: Int,
                map: collection.mutable.Map[Int, Int]): Boolean = {
    if (nums.length <= index) {
      false
    } else {
      val num = nums(index)

      if (map contains num) {
        true
      } else {
        map += num -> 1
        duplicate(nums, index + 1, map)
      }
    }
  }
}
