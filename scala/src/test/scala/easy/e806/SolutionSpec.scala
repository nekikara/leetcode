package easy.e806

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have numberOfLines" in {
    val widths1 = Array(10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10)
    val S = "abcdefghijklmnopqrstuvwxyz"
    val o1 = Array(3, 60)
    Solution.numberOfLines(widths1, S) should be (o1)
  }
  "Solution" should "be able to execute numberOfLines ver.1" in {
    val widths1 = Array(4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10)
    val S = "bbbcccdddaaa"
    val o1 = Array(2, 4)
    Solution.numberOfLines(widths1, S) should be (o1)
  }
}
