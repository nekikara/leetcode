package easy.e169

object Solution {
  def majorityElement(nums: Array[Int]): Int = {
    val coll = collection.mutable.Map.empty[Int, Int]
    nums.foreach(num => {
      if (coll contains num) {
        coll(num) += 1
      } else {
        coll += num -> 1
      }
    })

    coll.maxBy(p => p._2)._1
  }
}
