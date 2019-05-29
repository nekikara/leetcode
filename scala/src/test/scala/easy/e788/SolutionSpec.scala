package easy.e788

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have rotatedDigits 1" in {
    val a = 10
    val o = 4
    Solution.rotatedDigits(a) should be(o)
  }
}
