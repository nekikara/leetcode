package easy.e867

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have transpose" in {
    val o1 = Array(Array(1,4,7),Array(2,5,8), Array(3,6,9))
    Solution.transpose(Array(Array(1,2,3), Array(4,5,6), Array(7,8,9))) should equal (o1)

    val o2 = Array(Array(1,4), Array(2,5), Array(3,6))
    Solution.transpose(Array(Array(1,2,3), Array(4,5,6))) should equal (o2)
  }
}


