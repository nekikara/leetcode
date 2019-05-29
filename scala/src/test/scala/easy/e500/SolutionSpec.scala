package easy.e500

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have findWords 1" in {
    val a = Array("Hello", "Alaska", "Dad", "Peace")
    val o = Array("Alaska", "Dad")
    Solution.findWords(a) should be (o)
  }
}
