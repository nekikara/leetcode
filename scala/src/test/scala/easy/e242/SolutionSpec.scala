package easy.e242

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have isAnagram 1" in {
    val s = "iii"
    val t = "iii"
    val o = true
    Solution.isAnagram(s, t) should be(o)
  }
  "The Solution" should "have isAnagram 2" in {
    val s = "rat"
    val t = "car"
    val o = false
    Solution.isAnagram(s, t) should be(o)
  }
  "The Solution" should "have isAnagram 3" in {
    val s = "anagram"
    val t = "nagaram"
    val o = true
    Solution.isAnagram(s, t) should be(o)
  }
}
