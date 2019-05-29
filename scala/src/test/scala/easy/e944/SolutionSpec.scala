package easy.e944

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have minDeletionSize" in {
    val i1: Array[String] = Array("cba", "daf", "ghi")
    val o1: Int = 1
    Solution.minDeletionSize(i1) should equal (o1)

    val i2: Array[String] = Array("a", "b")
    val o2: Int = 0
    Solution.minDeletionSize(i2) should equal (o2)

    val i3: Array[String] = Array("zyx", "wvu", "tsr")
    val o3: Int = 3
    Solution.minDeletionSize(i3) should equal (o3)
  }
}
