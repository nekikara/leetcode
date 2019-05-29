package easy.e748

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have shortestCompletingWord 1" in {
    val licensePlate = "1s3 PSt"
    val words = Array("step", "steps", "stripe", "stepple")
    val o = "steps"

    Solution.shortestCompletingWord(licensePlate, words) should be(o)
  }
  "The Solution" should "have shortestCompletingWord 2" in {
    val licensePlate = "1s3 456"
    val words = Array("looks", "pest", "stew", "show")
    val o = "pest"

    Solution.shortestCompletingWord(licensePlate, words) should be(o)
  }
  "The Solution" should "have shortestCompletingWord 3" in {
    val licensePlate = "GrC8950"

    val words = Array(
      "measure",
      "other",
      "every",
      "base",
      "according",
      "level",
      "meeting",
      "none",
      "marriage",
      "rest"
    )
    val o = "according"

    Solution.shortestCompletingWord(licensePlate, words) should be(o)
  }
}
