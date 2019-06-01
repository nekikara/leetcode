package easy.e697

object Solution {
  def findShortestSubArray(nums: Array[Int]): Int = {
    val left = collection.mutable.Map.empty[Int, Int]
    val right = collection.mutable.Map.empty[Int, Int]
    val count = collection.mutable.Map.empty[Int, Int]

    for (i <- nums.indices) {
      val num = nums(i)
      if (!(left contains num)) {
        left += num -> i
      }
      right += num -> i
      if (!(count contains num)) {
        count += num -> 1
      } else {
        count(num) += 1
      }
    }

    val max = count.maxBy(p => p._2)
    count
      .filter(p => p._2 == max._2)
      .map(p => {
        right(p._1) - left(p._1) + 1
      })
      .min
  }
}
