package easy.e371

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have titleToNumber 1" in {
    val a = 1
    val b = 2
    val o = 3
    Solution.getSum(a, b) should be(o)
  }
  "The Solution" should "have titleToNumber 2" in {
    val a = -2
    val b = 3
    val o = 1
    Solution.getSum(a, b) should be(o)
  }
  "The Solution" should "have titleToNumber 3" in {
    val a = 1
    val b = -4
    val o = -3
    Solution.getSum(a, b) should be(o)
  }
}
