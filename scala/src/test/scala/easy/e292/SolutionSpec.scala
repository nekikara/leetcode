package easy.e292

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "canWinNim 1" in {
    Solution.canWinNim(4) should be(false)
  }
  "The Solution" should "canWinNim 2" in {
    Solution.canWinNim(1) should be(true)
  }
  "The Solution" should "canWinNim 3" in {
    Solution.canWinNim(2) should be(true)
  }
  "The Solution" should "canWinNim 4" in {
    Solution.canWinNim(3) should be(true)
  }
  "The Solution" should "canWinNim 5" in {
    Solution.canWinNim(5) should be(true)
  }
  "The Solution" should "canWinNim 6" in {
    Solution.canWinNim(8) should be(false)
  }
  "The Solution" should "canWinNim 7" in {
    Solution.canWinNim(9) should be(true)
  }
}
