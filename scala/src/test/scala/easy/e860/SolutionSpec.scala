package easy.e860

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have lemonadeChange 1" in {
    val i = Array(5, 5, 5, 10, 20)
    Solution.lemonadeChange(i) should be(true)
  }
  "The Solution" should "have lemonadeChange 2" in {
    val i = Array(5, 5, 10)
    Solution.lemonadeChange(i) should be(true)
  }
  "The Solution" should "have lemonadeChange 3" in {
    val i = Array(10, 10)
    Solution.lemonadeChange(i) should be(false)
  }
  "The Solution" should "have lemonadeChange 4" in {
    val i = Array(5, 5, 10, 10, 20)
    Solution.lemonadeChange(i) should be(false)
  }
}
