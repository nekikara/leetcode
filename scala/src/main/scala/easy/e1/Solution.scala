package easy.e1

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    val ans = collection.mutable.MutableList[Int]()

    var i = 0
    var j = 1
    while (i < nums.length - 1) {
      while (j < nums.length) {
        val sum = nums(i) + nums(j)
        if (sum == target) {
          ans += i
          ans += j
          i += nums.length
          j += nums.length
        }

        j += 1
      }
      i+= 1
      j = i + 1
    }
    ans.toArray
  }
}
