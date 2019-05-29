package easy.e557

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have reverseWords" in {
    val o1 = "s'teL ekat edoCteeL tsetnoc"
    Solution.reverseWords("Let's take LeetCode contest") should equal (o1)
  }
}



