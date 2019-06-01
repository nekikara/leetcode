package easy.e697

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have findShortestSubArray 1" in {
    val i = Array(1, 2, 2, 3, 1)
    Solution.findShortestSubArray(i) should be(2)
  }
  "The Solution" should "have findShortestSubArray 2" in {
    val i = Array(1, 2, 2, 3, 1, 4, 2)
    Solution.findShortestSubArray(i) should be(6)
  }
  "The Solution" should "have findShortestSubArray 3" in {
    val i = Array(1)
    Solution.findShortestSubArray(i) should be(1)
  }
  "The Solution" should "have findShortestSubArray 4" in {
    val i = Array(0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    Solution.findShortestSubArray(i) should be(13)
  }
  "The Solution" should "have findShortestSubArray 5" in {
    val i = Array(1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2)
    Solution.findShortestSubArray(i) should be(9)
  }
}
