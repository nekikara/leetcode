package easy.e893

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have numSpecialEquivGroups 1" in {
    val a = Array("a","b","c","a","c","c")
    Solution.numSpecialEquivGroups(a) should be (3)
  }
  "Solution" should "have numSpecialEquivGroups 2" in {
    val a = Array("aa","bb","ab","ba")
    Solution.numSpecialEquivGroups(a) should be (4)
  }
  "Solution" should "have numSpecialEquivGroups 3" in {
    val a = Array("abc","acb","bac","bca","cab","cba")
    Solution.numSpecialEquivGroups(a) should be (3)
  }
  "Solution" should "have numSpecialEquivGroups 4" in {
    val a = Array("abcd","cdab","adcb","cbad")
    Solution.numSpecialEquivGroups(a) should be (1)
  }
}


