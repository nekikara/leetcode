package easy.e561

object Solution {
  def arrayPairSum(nums: Array[Int]): Int = {
    val n = nums.length / 2
    val sorted = nums.sorted
    var sum = 0
    (0 to n - 1).foreach { i => {
      val x = i * 2
      sum += Array(sorted(x), sorted(x + 1)).min
    } }
    sum
  }
}
