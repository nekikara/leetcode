package easy.e665

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have checkPossibility" in {
    val a1 = Array(4, 2, 3)
    Solution.checkPossibility(a1) should be (true)
  }

  "Solution" should "return false" in {
    val a1 = Array(4,2,1)
    Solution.checkPossibility(a1) should be (false)
  }
  "Solution" should "return false2" in {
    val a1 = Array(1,5,4,6,7,10,8,9)
    Solution.checkPossibility(a1) should be (false)

  }
  "Solution" should "return false3" in {
    val a1 = Array(3,4,2,3)
    Solution.checkPossibility(a1) should be (false)
  }
  "Solution" should "return false4" in {
    val a1 = Array(5, 6, 1, 2)
    Solution.checkPossibility(a1) should be (false)
  }
  "Solution" should "return false5" in {
    val a1 = Array(3,2,3,2,4)
    Solution.checkPossibility(a1) should be (false)
  }
  "Solution" should "return false6" in {
    val a1 = Array(2,3,1,5,4)
    Solution.checkPossibility(a1) should be (false)
  }
  "Solution" should "return false7" in {
    val a1 = Array(5, 6, 1, 8, 4)
    Solution.checkPossibility(a1) should be (false)
  }

  "Solution" should "return true" in {
    val a1 = Array(4,6,1)
    Solution.checkPossibility(a1) should be (true)
  }
  "Solution" should "return true2" in {
    val a1 = Array(5, 1)
    Solution.checkPossibility(a1) should be (true)
  }
  "Solution" should "return true3" in {
    val a1 = Array(100000)
    Solution.checkPossibility(a1) should be (true)
  }
  "Solution" should "return true4" in {
    val a1 = Array(-1, 4,2, 3)
    Solution.checkPossibility(a1) should be (true)
  }
  "Solution" should "return true5" in {
    val a1 = Array(5, 6, 1, 8, 9)
    Solution.checkPossibility(a1) should be (true)
  }
}



