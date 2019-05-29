package easy.e892

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "surfaceArea 1" in {
    val i = Array(Array(2))
    Solution.surfaceArea(i) should be(10)
  }
  "The Solution" should "surfaceArea 2" in {
    val i = Array(Array(1, 2), Array(3, 4))
    Solution.surfaceArea(i) should be(34)
  }
  "The Solution" should "surfaceArea 3" in {
    val i = Array(Array(1, 0), Array(0, 2))
    Solution.surfaceArea(i) should be(16)
  }
  "The Solution" should "surfaceArea 4" in {
    val i = Array(Array(1, 1, 1), Array(1, 0, 1), Array(1, 1, 1))
    Solution.surfaceArea(i) should be(32)
  }
  "The Solution" should "surfaceArea 5" in {
    val i = Array(Array(2, 2, 2), Array(2, 1, 2), Array(2, 2, 2))
    Solution.surfaceArea(i) should be(46)
  }
  "The Solution" should "surfaceArea 6" in {
    val i = Array(
      Array(1, 1, 1, 1, 1),
      Array(1, 0, 1, 0, 1),
      Array(1, 1, 1, 1, 1),
      Array(1, 0, 1, 0, 1),
      Array(1, 1, 1, 1, 1),
    )
    Solution.surfaceArea(i) should be(78)
  }
  "The Solution" should "surfaceArea 7" in {
    val i = Array(
      Array(1, 2, 1, 2, 1),
      Array(2, 0, 1, 0, 2),
      Array(1, 1, 1, 1, 1),
      Array(2, 0, 1, 0, 2),
      Array(1, 2, 1, 2, 1),
    )
    Solution.surfaceArea(i) should be(110)
  }
}
