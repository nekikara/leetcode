package easy.e258

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have addDigits 1" in {
    val S = 38
    val o = 2

    Solution.addDigits(S) should be(o)
  }
  "The Solution" should "have addDigits 2" in {
    val S = 111
    val o = 3

    Solution.addDigits(S) should be(o)
  }
  "The Solution" should "have addDigits 3" in {
    val S = 999999
    val o = 9

    Solution.addDigits(S) should be(o)
  }
  "The Solution" should "have addDigits 4" in {
    val S = 0
    val o = 0

    Solution.addDigits(S) should be(o)
  }
}
