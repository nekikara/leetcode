package easy.e733

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have floodFill 1" in {
    var image = Array(Array(1, 1, 1), Array(1, 1, 0), Array(1, 0, 1))
    var omage = Array(Array(2, 2, 2), Array(2, 2, 0), Array(2, 0, 1))
    Solution.floodFill(image, 1, 1, 2) should be(omage)
  }
  "The Solution" should "have floodFill 2" in {
    var image = Array(
      Array(1, 1, 1, 1),
      Array(0, 0, 0, 1),
      Array(0, 0, 0, 1),
      Array(1, 0, 0, 1)
    )
    var omage = Array(
      Array(2, 2, 2, 2),
      Array(0, 0, 0, 2),
      Array(0, 0, 0, 2),
      Array(1, 0, 0, 2)
    )
    Solution.floodFill(image, 0, 0, 2) should be(omage)
  }
  "The Solution" should "have floodFill 3" in {
    var image = Array(Array(0, 0, 0), Array(0, 0, 0))
    var omage = Array(Array(2, 2, 2), Array(2, 2, 2))
    Solution.floodFill(image, 0, 0, 2) should be(omage)
  }
  "The Solution" should "have floodFill 4" in {
    var image = Array(Array(0, 0, 0), Array(0, 1, 1))
    var omage = Array(Array(0, 0, 0), Array(0, 1, 1))
    Solution.floodFill(image, 1, 1, 1) should be(omage)
  }
}
