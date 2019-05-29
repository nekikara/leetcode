package easy.e1009

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have bitwiseComplement 1" in {
    Solution.bitwiseComplement(5) should be (2)
  }
  "Solution" should "have bitwiseComplement 2" in {
    Solution.bitwiseComplement(7) should be (0)
  }
  "Solution" should "have bitwiseComplement 3" in {
    Solution.bitwiseComplement(10) should be (5)
  }
  "Solution" should "have bitwiseComplement 4" in {
    Solution.bitwiseComplement(0) should be (1)
  }
}


