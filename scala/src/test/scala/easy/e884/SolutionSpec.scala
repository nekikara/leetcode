package easy.e884

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have uncommonFromSentences 1" in {
    Solution.uncommonFromSentences(
      "this apple is sweet",
      "this apple is sour"
    ) should contain theSameElementsAs Array("sweet", "sour")
  }
  "Solution" should "have uncommonFromSentences 2" in {
    Solution.uncommonFromSentences(
      "apple apple",
      "banana"
    ) should contain theSameElementsAs Array("banana")
  }
}


