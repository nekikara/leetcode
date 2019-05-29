package easy.e917

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "reverseOnlyLetters 1" in {
    val a = "ab-cd"
    val o = "dc-ba"

    Solution.reverseOnlyLetters(a) should be(o)
  }
  "The Solution" should "reverseOnlyLetters 2" in {
    val a = "a-bC-dEf-ghIj"
    val o = "j-Ih-gfE-dCba"

    Solution.reverseOnlyLetters(a) should be(o)
  }
  "The Solution" should "reverseOnlyLetters 3" in {
    val a = "Test1ng-Leet=code-Q!"
    val o = "Qedo1ct-eeLg=ntse-T!"

    Solution.reverseOnlyLetters(a) should be(o)
  }
  "The Solution" should "reverseOnlyLetters 4" in {
    val a = "!"
    val o = "!"

    Solution.reverseOnlyLetters(a) should be(o)
  }
  "The Solution" should "reverseOnlyLetters 5" in {
    val a = "!ab!____"
    val o = "!ba!____"

    Solution.reverseOnlyLetters(a) should be(o)
  }
}
