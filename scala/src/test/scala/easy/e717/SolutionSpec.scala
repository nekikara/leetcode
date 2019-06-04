package easy.e717

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have isOneBitCharacter 1" in {
    val bits = Array(1, 0, 0)
    val output = true
    Solution.isOneBitCharacter(bits) should be(output)
  }
  "The Solution" should "have isOneBitCharacter 2" in {
    val bits = Array(1, 1, 1, 0)
    val output = false
    Solution.isOneBitCharacter(bits) should be(output)
  }
  "The Solution" should "have isOneBitCharacter 3" in {
    val bits = Array(1, 1, 0, 0)
    val output = true
    Solution.isOneBitCharacter(bits) should be(output)
  }
  "The Solution" should "have isOneBitCharacter 4" in {
    val bits = Array(0, 0)
    val output = true
    Solution.isOneBitCharacter(bits) should be(output)
  }
  "The Solution" should "have isOneBitCharacter 5" in {
    val bits = Array(1, 1, 0)
    val output = true
    Solution.isOneBitCharacter(bits) should be(output)
  }
}
