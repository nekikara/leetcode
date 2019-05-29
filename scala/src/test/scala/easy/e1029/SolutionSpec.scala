package easy.e1029

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have twoCitySchedCost 1" in {
    val i = Array(Array(10, 20), Array(30, 200), Array(400, 50), Array(30, 20))
    val o = 110
    Solution.twoCitySchedCost(i) should be(o)
  }
  "The Solution" should "have twoCitySchedCost 2" in {
    val i = Array(
      Array(259, 770),
      Array(448, 54),
      Array(926, 667),
      Array(184, 139),
      Array(840, 118),
      Array(577, 469)
    )
    val o = 1859
    Solution.twoCitySchedCost(i) should be(o)
  }
}
