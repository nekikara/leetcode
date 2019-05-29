package easy.e561

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have arrayPairSum" in {
    val i1 = Array(1, 4, 3, 2)
    val e1 = 4
    Solution.arrayPairSum(i1) should equal (e1)
  }
}
