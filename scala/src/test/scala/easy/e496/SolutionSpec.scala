package easy.e496

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have nextGreaterElement 1" in {
    val a = Array(4,1,2)
    val b = Array(1,3,4,2)
    Solution.nextGreaterElement(a, b) should be (Array(-1,3,-1))
  }
  "Solution" should "have nextGreaterElement 2" in {
    val a = Array(2,4)
    val b = Array(1,2,3,4)
    Solution.nextGreaterElement(a, b) should be (Array(3,-1))
  }
}
