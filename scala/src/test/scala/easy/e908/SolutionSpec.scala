package easy.e908

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have smallestRangeI" in {
    val a1: Array[Int] = Array(1)
    val k1 = 0
    val o1: Int = 0
    Solution.smallestRangeI(a1, k1) should be (o1)

    val a2: Array[Int] = Array(0, 10)
    val k2 = 2
    val o2: Int = 6
    Solution.smallestRangeI(a2, k2) should be (o2)

    val a3: Array[Int] = Array(1, 3, 6)
    val k3 = 3
    val o3: Int = 0
    Solution.smallestRangeI(a3, k3) should be (o3)

    val a4: Array[Int] = Array(3, 1, 10)
    val k4 = 4
    val o4: Int = 1
    Solution.smallestRangeI(a4, k4) should be (o4)
  }
}



