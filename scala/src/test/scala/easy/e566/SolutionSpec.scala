package easy.e566

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have matrixReshape 1" in {
    val a = Array(Array(1, 2), Array(3, 4))
    val r = 1
    val c = 4
    val o = Array(Array(1, 2, 3, 4))
    Solution.matrixReshape(a, r, c) should be(o)
  }
  "Solution" should "have matrixReshape 2" in {
    val a = Array(Array(1, 2), Array(3, 4))
    val r = 2
    val c = 4
    Solution.matrixReshape(a, r, c) should be(a)
  }
  "Solution" should "have matrixReshape 3" in {
    val a = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10))
    val r = 5
    val c = 2
    val o =
      Array(Array(1, 2), Array(3, 4), Array(5, 6), Array(7, 8), Array(9, 10))
    Solution.matrixReshape(a, r, c) should be(o)
  }
}
