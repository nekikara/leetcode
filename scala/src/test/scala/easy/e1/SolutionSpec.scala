package easy.e1

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have twoSum 1" in {
    val a1 = Array(2, 7, 11, 15)
    val a2 = 9
    val o = Array(0, 1)
    Solution.twoSum(a1, a2) should be (o)
  }

  "Solution" should "have twoSum 2" in {
    val a1 = Array(2, 7, 11, 15, 30, 100, 120)
    val a2 = 45
    val o = Array(3, 4)
    Solution.twoSum(a1, a2) should be (o)
  }
}

