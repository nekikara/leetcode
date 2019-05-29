package easy.e476

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have findComplement 1" in {
    Solution.findComplement(5) should be (2)
  }
  "Solution" should "have findComplement 2" in {
    Solution.findComplement(1) should be (0)
  }
}

