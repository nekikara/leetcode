package easy.e868

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have binaryGap 1" in {
    Solution.binaryGap(22) should be (2)
  }
  "Solution" should "have binaryGap 2" in {
    Solution.binaryGap(5) should be (2)
  }
  "Solution" should "have binaryGap 3" in {
    Solution.binaryGap(6) should be (1)
  }
  "Solution" should "have binaryGap 4" in {
    Solution.binaryGap(8) should be (0)
  }
  "Solution" should "have binaryGap 5" in {
    Solution.binaryGap(1) should be (0)
  }
  "Solution" should "have binaryGap 6" in {
    Solution.binaryGap(17) should be (4)
  }
  "Solution" should "have binaryGap 7" in {
    Solution.binaryGap(25) should be (3)
  }
}

