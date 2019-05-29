package easy.e1013

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have canThreePartsEqualSum 1" in {
    val S = Array(0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1)
    val o = true
    Solution.canThreePartsEqualSum(S) should be(o)
  }
  "The Solution" should "have canThreePartsEqualSum 2" in {
    val S = Array(0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1)
    val o = false
    Solution.canThreePartsEqualSum(S) should be(o)
  }
  "The Solution" should "have canThreePartsEqualSum 3" in {
    val S = Array(3, 3, 6, 5, -2, 2, 5, 1, -9, 4)
    val o = true
    Solution.canThreePartsEqualSum(S) should be(o)
  }
  "The Solution" should "have canThreePartsEqualSum 4" in {
    val S = Array(1, 1, 1)
    val o = true
    Solution.canThreePartsEqualSum(S) should be(o)
  }
  "The Solution" should "have canThreePartsEqualSum 5" in {
    val S = Array(1, 1, 1, 1)
    val o = false
    Solution.canThreePartsEqualSum(S) should be(o)
  }
  "The Solution" should "have canThreePartsEqualSum 6" in {
    val S = Array(12, -4, 16, -5, 9, -3, 3, 8, 0)
    val o = true
    Solution.canThreePartsEqualSum(S) should be(o)
  }
  "The Solution" should "have canThreePartsEqualSum 7" in {
    val S = Array(1, -2, 2, 1, 1, 0)
    val o = true
    Solution.canThreePartsEqualSum(S) should be(o)
  }
}
