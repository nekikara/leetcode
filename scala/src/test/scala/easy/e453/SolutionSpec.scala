package easy.e453

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have minMoves 1" in {
    val bits = Array(1, 2, 3)
    val output = 3
    Solution.minMoves(bits) should be(output)
  }
  "The Solution" should "have minMoves 2" in {
    val bits = Array(1, 5, 10)
    val output = 13
    Solution.minMoves(bits) should be(output)
  }
}
