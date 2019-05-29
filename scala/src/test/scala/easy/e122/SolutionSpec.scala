package easy.e122

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have maxProfit 1" in {
    val i = Array(7, 1, 5, 3, 6, 4)
    val o = 7
    Solution.maxProfit(i) should be(o)
  }
  "The Solution" should "have maxProfit 2" in {
    val i = Array(1, 2, 3, 4, 5)
    val o = 4
    Solution.maxProfit(i) should be(o)
  }
  "The Solution" should "have maxProfit 3" in {
    val i = Array(7, 6, 4, 3, 1)
    val o = 0
    Solution.maxProfit(i) should be(o)
  }
  "The Solution" should "have maxProfit 4" in {
    val i = Array(1, 2, 3, 7, 10)
    val o = 9
    Solution.maxProfit(i) should be(o)
  }
}
