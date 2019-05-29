package easy.e1002

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have commonChars" in {

    val i1 = Array("bella", "label", "roller")
    val e1 = List("e", "l", "l")
    Solution.commonChars(i1) should be (e1)

    val i2 = Array("cool", "lock", "cook")
    val e2 = List("c", "o")
    Solution.commonChars(i2) should be (e2)
  }
}


