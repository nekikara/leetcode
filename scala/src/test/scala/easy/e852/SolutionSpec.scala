package easy.e852


import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have peakIndexInMountainArray" in {
    val i1: Array[Int] = Array(0, 1, 0)
    val o1: Int = 1
    Solution.peakIndexInMountainArray(i1) should equal (o1)

    val i2: Array[Int] = Array(0, 2, 1, 0)
    val o2: Int = 1
    Solution.peakIndexInMountainArray(i2) should equal (o2)

    val i3: Array[Int] = Array(0, 1, 2, 3, 4, 5, 10, 100, 10000, 100000, 9999, 1, 0)
    val o3: Int = 9
    Solution.peakIndexInMountainArray(i3) should equal (o3)
  }
}

