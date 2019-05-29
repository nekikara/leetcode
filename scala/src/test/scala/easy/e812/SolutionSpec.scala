package easy.e812

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "largestTriangleArea 1" in {
    val i =
      Array(Array(0, 0), Array(0, 1), Array(1, 0), Array(0, 2), Array(2, 0))
    Solution.largestTriangleArea(i) should be(2)
  }
}
