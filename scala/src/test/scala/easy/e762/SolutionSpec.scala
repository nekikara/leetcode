package easy.e762

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have countPrimeSetBits 1" in {
    Solution.countPrimeSetBits(6, 10) should be(4)
  }
  "Solution" should "have countPrimeSetBits 2" in {
    Solution.countPrimeSetBits(10, 15) should be(5)
  }
}
