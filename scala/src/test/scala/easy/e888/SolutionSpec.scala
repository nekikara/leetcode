package easy.e888

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have fairCandySwap 1" in {
    val a = Array(1, 1)
    val b = Array(2, 2)
    val o = Array(1, 2)
    Solution.fairCandySwap(a, b) should be(o)
  }
  "Solution" should "have fairCandySwap 2" in {
    val a = Array(1, 2)
    val b = Array(2, 3)
    val o = Array(1, 2)
    Solution.fairCandySwap(a, b) should be(o)
  }
  "Solution" should "have fairCandySwap 3" in {
    val a = Array(2)
    val b = Array(1, 3)
    val o = Array(2, 3)
    Solution.fairCandySwap(a, b) should be(o)
  }
  "Solution" should "have fairCandySwap 4" in {
    val a = Array(1, 2, 5)
    val b = Array(2, 4)
    val o = Array(5, 4)
    Solution.fairCandySwap(a, b) should be(o)
  }
}
