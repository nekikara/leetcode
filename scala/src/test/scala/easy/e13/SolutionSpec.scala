package easy.e13

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have romanToInt 1" in {
    val s = "III"
    val o = 3
    Solution.romanToInt(s) should be(o)
  }
  "The Solution" should "have romanToInt 2" in {
    val s = "XVIII"
    val o = 18
    Solution.romanToInt(s) should be(o)
  }
  "The Solution" should "have romanToInt 3" in {
    val s = "IV"
    val o = 4
    Solution.romanToInt(s) should be(o)
  }
  "The Solution" should "have romanToInt 4" in {
    val s = "DCIX"
    val o = 609
    Solution.romanToInt(s) should be(o)
  }
}
