package easy.e976

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have largestPerimeter 1" in {
    val i = Array(2, 1, 2)
    val o = 5
    Solution.largestPerimeter(i) should be(o)
  }
  "Solution" should "have largestPerimeter 2" in {
    val i = Array(1, 2, 1)
    val o = 0
    Solution.largestPerimeter(i) should be(o)
  }
  "Solution" should "have largestPerimeter 3" in {
    val i = Array(3, 2, 3, 4)
    val o = 10
    Solution.largestPerimeter(i) should be(o)
  }
  "Solution" should "have largestPerimeter 4" in {
    val i = Array(3, 6, 2, 3)
    val o = 8
    Solution.largestPerimeter(i) should be(o)
  }
}
