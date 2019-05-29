package easy.e349

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have intersection 1" in {
    val a = Array(1, 2, 2, 1)
    val b = Array(2, 2)
    val o = Array(2)
    Solution.intersection(a, b) should be(o)
  }
  "The Solution" should "have intersection 2" in {
    val a = Array(4, 9, 5)
    val b = Array(9, 4, 9, 8, 4)
    val o = Array(9, 4)
    Solution.intersection(a, b) should be(o)
  }
}
