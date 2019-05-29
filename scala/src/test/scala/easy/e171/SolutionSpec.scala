package easy.e171

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have titleToNumber 1" in {
    val i = "A"
    val o = 1
    Solution.titleToNumber(i) should be(o)
  }
  "The Solution" should "have titleToNumber 2" in {
    val i = "AB"
    val o = 28
    Solution.titleToNumber(i) should be(o)
  }
  "The Solution" should "have titleToNumber 3" in {
    val i = "ZY"
    val o = 701
    Solution.titleToNumber(i) should be(o)
  }
  "The Solution" should "have titleToNumber 4" in {
    val i = "ZZ"
    val o = 702
    Solution.titleToNumber(i) should be(o)
  }
  "The Solution" should "have titleToNumber 5" in {
    val i = "AAA"
    val o = 703
    Solution.titleToNumber(i) should be(o)
  }
  "The Solution" should "have titleToNumber 6" in {
    val i = "ZZZZ"
    val o = 475254
    Solution.titleToNumber(i) should be(o)
  }
}
