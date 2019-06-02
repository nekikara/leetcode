package easy.e383

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have canConstruct 1" in {
    val a = "a"
    val b = "b"
    Solution.canConstruct(a, b) should be(false)
  }
  "The Solution" should "have canConstruct 2" in {
    val a = "aa"
    val b = "ab"
    Solution.canConstruct(a, b) should be(false)
  }
  "The Solution" should "have canConstruct 3" in {
    val a = "aa"
    val b = "aab"
    Solution.canConstruct(a, b) should be(true)
  }
}
