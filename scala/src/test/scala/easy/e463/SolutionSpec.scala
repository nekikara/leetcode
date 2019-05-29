package easy.e463

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have islandPerimeter 1" in {
    val a = Array(
      Array(0,1,0,0),
      Array(1,1,1,0),
      Array(0,1,0,0),
      Array(1,1,0,0),
    )
    Solution.islandPerimeter(a) should be (16)
  }
  "Solution" should "have islandPerimeter 2" in {
    val a = Array(
      Array(1,0,0),
      Array(0,0,0),
      Array(0,0,0),
    )
    Solution.islandPerimeter(a) should be (4)
  }
  "Solution" should "have islandPerimeter 3" in {
    val a = Array(
      Array(1,1,1,0,0,0,0,0),
      Array(0,0,1,0,0,0,0,0),
      Array(0,0,0,0,0,0,0,0),
    )
    Solution.islandPerimeter(a) should be (10)
  }
  "Solution" should "have islandPerimeter 4" in {
    val a = Array(
      Array(1,0),
    )
    Solution.islandPerimeter(a) should be (4)
  }
}

