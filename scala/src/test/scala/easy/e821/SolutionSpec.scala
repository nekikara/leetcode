package easy.e821

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have shortestToChar" in {
    val a1 = "loveleetcode"
    val o1 = Array(3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0)

    Solution.shortestToChar(a1, 'e') should be (o1)
  }
}
