package easy.e496

object Solution {
  def nextGreaterElement(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {

    val seq = for (i <- nums1.indices) yield {
      val one = nums1(i)
      val secondIndex = secondNumsIndex(one, nums2, 0)
      greater(nums2, secondIndex, one)
    }

    seq.toArray
  }

  def secondNumsIndex(one: Int, nums2: Array[Int], index: Int): Int =
    if (one == nums2(index)) index
    else if (nums2.length <= index) -1
    else secondNumsIndex(one, nums2, index + 1)

  def greater(num2: Array[Int], index: Int, num: Int): Int = {
    if (num2.length <= index) {
      -1
    } else if (num < num2(index)) {
      num2(index)
    }  else {
      greater(num2, index + 1, num)
    }
  }
}
