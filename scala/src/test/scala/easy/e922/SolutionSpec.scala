package easy.e922

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have sortArrayByParityII" in {

    val i1 = Array(4,2,5,7)
    val e1 = Array(4,5,2,7)
    Solution.sortArrayByParityII(i1) should be (e1)

    val i2 = Array(4,2,5,7,8,10,11)
    val e2 = Array(4,5,2,7,8,11,10)
    Solution.sortArrayByParityII(i2) should be (e2)
  }
}

