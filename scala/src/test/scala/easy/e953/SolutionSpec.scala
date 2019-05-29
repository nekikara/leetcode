package easy.e953

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "isAlienSorted 1" in {
    val words = Array("hello", "leetcode")
    val order = "hlabcdefgijkmnopqrstuvwxyz"

    Solution.isAlienSorted(words, order) should be(true)
  }
  "The Solution" should "isAlienSorted 2" in {
    val words = Array("word", "world", "row")
    val order = "worldabcefghijkmnpqstuvxyz"

    Solution.isAlienSorted(words, order) should be(false)
  }
  "The Solution" should "isAlienSorted 3" in {
    val words = Array("apple", "app")
    val order = "abcdefghijklmnopqrstuvwxyz"

    Solution.isAlienSorted(words, order) should be(false)
  }
}
