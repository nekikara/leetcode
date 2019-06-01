package easy.e387

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have firstUniqChar 1" in {
    val i = "leetcode"
    Solution.firstUniqChar(i) should be(0)
  }
  "The Solution" should "have firstUniqChar 2" in {
    val i = "loveleetcode"
    Solution.firstUniqChar(i) should be(2)
  }
  "The Solution" should "have firstUniqChar 3" in {
    val i = "ll"
    Solution.firstUniqChar(i) should be(-1)
  }
}
