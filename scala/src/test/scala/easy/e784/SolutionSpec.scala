package easy.e784

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have letterCasePermutation 1" in {
    val S = "a1b2"
    val o = List("a1b2", "a1B2", "A1b2", "A1B2")

    Solution.letterCasePermutation(S) should be(o)
  }
  "The Solution" should "have letterCasePermutation 2" in {
    val S = "3z4"
    val o = List("3z4", "3Z4")

    Solution.letterCasePermutation(S) should be(o)
  }
  "The Solution" should "have letterCasePermutation 3" in {
    val S = "12345"
    val o = List("12345")

    Solution.letterCasePermutation(S) should be(o)
  }
  "The Solution" should "have letterCasePermutation 4" in {
    val S = "C"
    val o = List("c", "C")

    Solution.letterCasePermutation(S) should be(o)
  }
}
