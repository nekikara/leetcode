package easy.e693

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have hasAlternatingBits 1" in {
    Solution.hasAlternatingBits(5) should be(true)
  }
  "Solution" should "have hasAlternatingBits 2" in {
    Solution.hasAlternatingBits(7) should be(false)
  }
  "Solution" should "have hasAlternatingBits 3" in {
    Solution.hasAlternatingBits(11) should be(false)
  }
  "Solution" should "have hasAlternatingBits 4" in {
    Solution.hasAlternatingBits(10) should be(true)
  }
  "Solution" should "have hasAlternatingBits 5" in {
    Solution.hasAlternatingBits(4) should be(false)
  }
}
