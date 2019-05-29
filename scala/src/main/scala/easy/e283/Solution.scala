package easy.e283

object Solution {
  def moveZeroes(nums: Array[Int]): Unit = {
    var lastNonZeroIndex = 0

    for (i <- nums.indices) {
      val n = nums(i)
      if (n != 0) {
        val tmp = nums(lastNonZeroIndex)
        nums(lastNonZeroIndex) = n
        nums(i) = tmp
        lastNonZeroIndex += 1
      }
    }
    println(nums.mkString(" "))
  }
}
