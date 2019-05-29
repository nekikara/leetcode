package easy.e283

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have moveZeroes 1" in {
    val a = Array(0, 1, 0, 3, 12)
    val o = Array(1, 3, 12, 0, 0)
    Solution.moveZeroes(a) should be(o)
  }
  "The Solution" should "have moveZeroes 2" in {
    val a = Array(1)
    val o = Array(1)
    Solution.moveZeroes(a) should be(o)
  }
}
