package easy.e766

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have isToeplitzMatrix 1" in {
    val a = Array(
      Array(1,2,3,4),
      Array(5,1,2,3),
      Array(9,5,1,2)
    )
    Solution.isToeplitzMatrix(a) should be (true)
  }
  "Solution" should "have isToeplitzMatrix 2" in {
    val a = Array(
      Array(1,2),
      Array(2,2),
    )
    Solution.isToeplitzMatrix(a) should be (false)
  }
  "Solution" should "have isToeplitzMatrix 3" in {
    val a = Array(
      Array(3,3,3),
      Array(3,3,3),
      Array(3,3,3),
    )
    Solution.isToeplitzMatrix(a) should be (true)
  }
  "Solution" should "have isToeplitzMatrix 4" in {
    val a = Array(
      Array(3,3,3),
      Array(3,1,3),
      Array(3,3,3),
    )
    Solution.isToeplitzMatrix(a) should be (false)
  }
  "Solution" should "have isToeplitzMatrix 5" in {
    val a = Array(
      Array(3,3,3),
    )
    Solution.isToeplitzMatrix(a) should be (true)
  }
}


