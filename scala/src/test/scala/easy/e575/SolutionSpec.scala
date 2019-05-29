package easy.e575

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have distributeCandies 1" in {
    val a = Array(1,1,2,2,3,3)
    Solution.distributeCandies(a) should be (3)
  }
  "Solution" should "have distributeCandies 2" in {
    val a = Array(1,1,2,3)
    Solution.distributeCandies(a) should be (2)
  }
  "Solution" should "have distributeCandies 3" in {
    val a = Array(1,1,2,3, -100, -100, 5,4)
    Solution.distributeCandies(a) should be (4)
  }
}




