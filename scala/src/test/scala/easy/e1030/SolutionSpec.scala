package easy.e1030

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have allCellsDistOrder" in {
    val o1 = Array(Array(0,0),Array(0,1))
    Solution.allCellsDistOrder(1, 2, 0, 0) should equal (o1)

    val o2 = Array(Array(0,1),Array(0,0),Array(1,1), Array(1,0))
    Solution.allCellsDistOrder(2, 2, 0, 1) should equal (o2)

    val o3 = Array(Array(1,2),Array(0,2),Array(1,1),Array(0,1),Array(1,0),Array(0,0))
    Solution.allCellsDistOrder(2, 3, 1, 2) should equal (o3)
  }
}

