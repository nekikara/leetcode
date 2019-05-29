package easy.e985

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have sumEvenAfterQueries" in {
    val a1: Array[Int] = Array(1, 2, 3, 4)
    val q1: Array[Array[Int]] = Array(Array(1, 0), Array(-3, 1), Array(-4, 0), Array(2, 3))
    val o1: Array[Int] = Array(8,6,2,4)
    Solution.sumEvenAfterQueries(a1, q1) should equal (o1)
  }
}

