package easy.e217

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have containsDuplicate 1" in {
    val i = Array(1, 2, 3, 1)
    val o = true
    Solution.containsDuplicate(i) should be(o)
  }
  "The Solution" should "have containsDuplicate 2" in {
    val i = Array(1, 2, 3, 4)
    val o = false
    Solution.containsDuplicate(i) should be(o)
  }
  "The Solution" should "have containsDuplicate 3" in {
    val i = Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
    val o = true
    Solution.containsDuplicate(i) should be(o)
  }
}
