package easy.e883

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have projectionArea" in {

    val i1 = Array(Array(2))
    val e1 = 5
    Solution.projectionArea(i1) should be (e1)

    val i2 = Array(Array(1,2), Array(3,4))
    val e2 = 17
    Solution.projectionArea(i2) should be (e2)

    val i3 = Array(Array(1,0), Array(0,2))
    val e3 = 8
    Solution.projectionArea(i3) should be (e3)

    val i4 = Array(Array(1,1,1), Array(1,0,1), Array(1,1,1))
    val e4 = 14
    Solution.projectionArea(i4) should be (e4)

    val i5 = Array(Array(2,2,2), Array(2,1,2), Array(2,2,2))
    val e5 = 21
    Solution.projectionArea(i5) should be (e5)
  }
}



