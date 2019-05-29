package easy.e485

object Solution {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    maxer(nums, nums.length, 0, 0, 0)
  }

  def maxer(nums: Array[Int], N: Int, index: Int, max: Int, cons: Int): Int = {
    if (N == index) {
      return Array(max, cons).max
    }
    val cur = nums(index)
    if (cur == 0) {
      if (max < cons) {
        maxer(nums, N, index + 1, cons, 0)
      } else {
        maxer(nums, N, index + 1, max, 0)
      }
    } else {
      maxer(nums, N, index + 1, max, cons + 1)
    }
  }
}
