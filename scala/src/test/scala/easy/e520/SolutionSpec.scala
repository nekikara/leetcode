package easy.e520

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have detectCapitalUse 1" in {
    val t = "USA"
    val o = true
    Solution.detectCapitalUse(t) should be(o)
  }
  "The Solution" should "have detectCapitalUse 2" in {
    val t = "USa"
    val o = false
    Solution.detectCapitalUse(t) should be(o)
  }
  "The Solution" should "have detectCapitalUse 3" in {
    val t = "Usa"
    val o = true
    Solution.detectCapitalUse(t) should be(o)
  }
  "The Solution" should "have detectCapitalUse 4" in {
    val t = "U"
    val o = true
    Solution.detectCapitalUse(t) should be(o)
  }
  "The Solution" should "have detectCapitalUse 5" in {
    val t = "FlaG"
    val o = false
    Solution.detectCapitalUse(t) should be(o)
  }
  "The Solution" should "have detectCapitalUse 6" in {
    val t = "Fl"
    val o = true
    Solution.detectCapitalUse(t) should be(o)
  }
  "The Solution" should "have detectCapitalUse 7" in {
    val t = "FF"
    val o = true
    Solution.detectCapitalUse(t) should be(o)
  }
}
