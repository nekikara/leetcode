package easy.e1021

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have removeOuterParentheses" in {
    val i1 = "(()())(())"
    val o1 = "()()()"
    Solution.removeOuterParentheses(i1) should equal (o1)

    val i2 = "(()())(())(()(()))"
    val o2 = "()()()()(())"
    Solution.removeOuterParentheses(i2) should equal (o2)

    val i3 = "()()"
    val o3 = ""
    Solution.removeOuterParentheses(i3) should equal (o3)
  }
}
