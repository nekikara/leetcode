package easy.e167

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have twoSum 1" in {
    val i = Array(2, 7, 11, 15)
    val target = 9
    val output = Array(1, 2)
    Solution.twoSum(i, target) should be(output)
  }
  "The Solution" should "have twoSum 2" in {
    val i = Array(2, 7, 11, 15)
    val target = 17
    val output = Array(1, 4)
    Solution.twoSum(i, target) should be(output)
  }
  "The Solution" should "have twoSum 3" in {
    val i = Array(1, 2)
    val target = 3
    val output = Array(1, 2)
    Solution.twoSum(i, target) should be(output)
  }
  "The Solution" should "have twoSum 4" in {
    val i = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 49, 51)
    val target = 100
    val output = Array(14, 15)
    Solution.twoSum(i, target) should be(output)
  }
  "The Solution" should "have twoSum 5" in {
    val i = Array(-1, 0)
    val target = -1
    val output = Array(1, 2)
    Solution.twoSum(i, target) should be(output)
  }
  "The Solution" should "have twoSum 6" in {
    val i = Array(0, 0, 3, 4)
    val target = 0
    val output = Array(1, 2)
    Solution.twoSum(i, target) should be(output)
  }
}
