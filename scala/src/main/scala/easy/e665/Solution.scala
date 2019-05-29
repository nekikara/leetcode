package easy.e665

object Solution {
  def checkPossibility2(nums: Array[Int]): Boolean = {
    var count = 0

    var i = 0
    while (i < nums.length) {
      val n = nums(i)
      if (i == 0) {
        if (2 < nums.length) {
          val plus = nums(i + 1)
          if (plus < n) {
            nums(i) = plus
            count += 1
          }
        }
      } else if (i < nums.length - 1) {
        val plus = nums(i + 1)
        val minus = nums(i - 1)
        if (minus <= plus && (plus < n || n < minus)) {
          nums(i) = minus
          count += 1
        } else if (minus >= plus && minus > n) {
          nums(i) = minus
          count += 1
        }
      } else {
        val minus = nums(i - 1)
        if (n < minus) {
          nums(i) = minus
          count += 1
        }
      }
      if (count > 2) {
        i = nums.length
      }
      i += 1
    }
    count < 2
  }

  def checkPossibility(nums: Array[Int]): Boolean = {
    if (nums.length < 3) {
      return true
    }

    var count = 0
    for (i <- 0 until nums.length - 1) {
      if (nums(i+1) < nums(i)) {
        count += 1
      }
      if (i < nums.length - 3) {
        if (nums(i + 2) < nums(i) && nums(i + 3) < nums(i + 1)) {
          return false
        }
      }
    }
    count < 2
  }
}
