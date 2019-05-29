package easy.e136

object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    2 * nums.toSet.sum - nums.sum
  }
}
