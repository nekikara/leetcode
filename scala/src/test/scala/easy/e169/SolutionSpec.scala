package easy.e169

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have majorityElement 1" in {
    val i = Array(3, 2, 3)
    val o = 3
    Solution.majorityElement(i) should be(o)
  }
  "The Solution" should "have majorityElement 2" in {
    val i = Array(2, 2, 1, 1, 1, 2, 2)
    val o = 2
    Solution.majorityElement(i) should be(o)
  }
}
