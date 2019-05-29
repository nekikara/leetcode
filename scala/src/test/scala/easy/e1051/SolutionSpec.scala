package easy.e1051

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have heightChecker 1" in {
    val t = Array(1, 1, 4, 2, 1, 3)
    Solution.heightChecker(t) should be(3)
  }
  "The Solution" should "have heightChecker 2" in {
    val t = Array(1, 1, 4, 1, 2, 3)
    Solution.heightChecker(t) should be(4)
  }
}
