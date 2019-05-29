package easy.e937

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have reorderLogFiles 1" in {
    val a = Array(
      "a1 9 2 3 1",
      "g1 act car",
      "zo4 4 7",
      "ab1 off key dog",
      "a8 act zoo"
    )
    val o = Array(
      "g1 act car",
      "a8 act zoo",
      "ab1 off key dog",
      "a1 9 2 3 1",
      "zo4 4 7"
    )
    Solution.reorderLogFiles(a) should be(o)
  }
  "Solution" should "have reorderLogFiles 2" in {
    val a = Array(
      "zo4 4 7",
      "g1 act car",
      "a2 7 7",
      "ab1 off key dog",
      "a8 act zoq",
      "a8 act zop",
      "a1 9 2 3 1",
    )
    val o = Array(
      "g1 act car",
      "a8 act zop",
      "a8 act zoq",
      "ab1 off key dog",
      "zo4 4 7",
      "a2 7 7",
      "a1 9 2 3 1",
    )
    Solution.reorderLogFiles(a) should be(o)
  }
  "Solution" should "have reorderLogFiles 3" in {
    val a = Array(
      "a1 9 2 3 1",
      "g1 act car",
      "zo4 4 7",
      "ab1 off key dog",
      "a8 act zoo",
      "a2 act car"
    )
    val o = Array(
      "a2 act car",
      "g1 act car",
      "a8 act zoo",
      "ab1 off key dog",
      "a1 9 2 3 1",
      "zo4 4 7"
    )
    Solution.reorderLogFiles(a) should be(o)
  }
}
