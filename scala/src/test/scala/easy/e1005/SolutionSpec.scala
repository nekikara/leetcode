package easy.e1005

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have largestSumAfterKNegations 1" in {
    val a = Array(4, 2, 3)
    val k = 1
    Solution.largestSumAfterKNegations(a, k) should be(5)
  }
  "The Solution" should "have largestSumAfterKNegations 2" in {
    val a = Array(3, -1, 0, 2)
    val k = 3
    Solution.largestSumAfterKNegations(a, k) should be(6)
  }
  "The Solution" should "have largestSumAfterKNegations 3" in {
    val a = Array(2, -3, -1, 5, -4)
    val k = 2
    Solution.largestSumAfterKNegations(a, k) should be(13)
  }
}
