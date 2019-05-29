package easy.e682

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have calPoints 1" in {
    val a = Array("5","2","C","D","+")
    Solution.calPoints(a) should be (30)
  }
  "Solution" should "have calPoints 2" in {
    val a = Array("5","-2","4","C","D","9","+","+")
    Solution.calPoints(a) should be (27)
  }
}
