package easy.e728

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have selfDividingNumbers" in {
    val iLeft: Int = 1
    val iRight: Int = 22
    val o: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)

    Solution.selfDivingNumbers(iLeft, iRight) should equal (o)
    Solution.selfDivingNumbers(127, 128) should not equal (List[Int](127, 128))
    Solution.selfDivingNumbers(127, 128) should equal (List[Int](128))
  }
}
