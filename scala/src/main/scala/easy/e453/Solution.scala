package easy.e453

object Solution {
  def minMoves(nums: Array[Int]): Int = {
    val min = nums.min
    nums.map(_ - min).sum
  }
}
