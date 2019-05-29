package easy.e521

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have findLUSlength 1" in {
    val a = "aba"
    val b = "cdc"
    val o = 3

    Solution.findLUSlength(a, b) should be(o)
  }
}
