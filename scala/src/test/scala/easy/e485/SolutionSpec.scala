package easy.e485

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have findMaxConsecutiveOnes 1" in {
    val S = Array(1, 1, 0, 0, 1, 1, 1)
    val o = 3
    Solution.findMaxConsecutiveOnes(S) should be(o)
  }
  "The Solution" should "have findMaxConsecutiveOnes 2" in {
    val S = Array(1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1)
    val o = 4
    Solution.findMaxConsecutiveOnes(S) should be(o)
  }
}
