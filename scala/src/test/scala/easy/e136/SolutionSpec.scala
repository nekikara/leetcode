package easy.e136

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have singleNumber 1" in {
    val a = Array(2,2,1)
    Solution.singleNumber(a) should be (1)
  }
  "Solution" should "have singleNumber 2" in {
    val a = Array(4,1,2,1,2)
    Solution.singleNumber(a) should be (4)
  }
}



