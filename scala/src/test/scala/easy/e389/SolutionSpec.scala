package easy.e389

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have findTheDifference 1" in {
    val s = "abcd"
    val t = "abcde"
    val o = 'e'
    Solution.findTheDifference(s, t) should be(o)
  }
  "The Solution" should "have findTheDifference 2" in {
    val s = "badc"
    val t = "abecd"
    val o = 'e'
    Solution.findTheDifference(s, t) should be(o)
  }
  "The Solution" should "have findTheDifference 3" in {
    val s = "ae"
    val t = "aea"
    val o = 'a'
    Solution.findTheDifference(s, t) should be(o)
  }
  "The Solution" should "have findTheDifference 4" in {
    val s = "bbb"
    val t = "bbba"
    val o = 'a'
    Solution.findTheDifference(s, t) should be(o)
  }
}
