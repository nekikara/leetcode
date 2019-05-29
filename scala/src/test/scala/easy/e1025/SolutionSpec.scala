package easy.e1025

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have divisorGame 1" in {
    Solution.divisorGame(2) should be (true)
  }
  "Solution" should "have divisorGame 2" in {
    Solution.divisorGame(3) should be (false)
  }
  "Solution" should "have divisorGame 3" in {
    Solution.divisorGame(1) should be (false)
  }
  "Solution" should "have divisorGame 4" in {
    Solution.divisorGame(4) should be (true)
  }
}



