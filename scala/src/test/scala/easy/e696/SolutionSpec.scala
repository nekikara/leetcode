package easy.e696

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have countBinarySubstrings 1" in {
    val i = "00110011"
    val o = 6
    Solution.countBinarySubstrings(i) should be(o)
  }
  "The Solution" should "have countBinarySubstrings 2" in {
    val i = "10101"
    val o = 4
    Solution.countBinarySubstrings(i) should be(o)
  }
}
