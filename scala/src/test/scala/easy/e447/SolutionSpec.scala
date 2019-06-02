package easy.e447

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have numberOfBoomerangs 1" in {
    val i = Array(Array(0, 0), Array(1, 0), Array(2, 0))

    Solution.numberOfBoomerangs(i) should be(2)
  }
  "The Solution" should "have numberOfBoomerangs 2" in {
    val i =
      Array(Array(0, 0), Array(1, 0), Array(-1, 0), Array(0, 1), Array(0, -1))

    Solution.numberOfBoomerangs(i) should be(2)
  }
}
