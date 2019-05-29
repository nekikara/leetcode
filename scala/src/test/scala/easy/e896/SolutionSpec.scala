package easy.e896

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have isMonotonic 1" in {
    val S = Array(1, 2, 2, 3)
    val o = true
    Solution.isMonotonic(S) should be(o)
  }
  "The Solution" should "have isMonotonic 2" in {
    val S = Array(6, 5, 4, 4)
    val o = true
    Solution.isMonotonic(S) should be(o)
  }
  "The Solution" should "have isMonotonic 3" in {
    val S = Array(1, 3, 2)
    val o = false
    Solution.isMonotonic(S) should be(o)
  }
  "The Solution" should "have isMonotonic 4" in {
    val S = Array(1, 2, 4, 5)
    val o = true
    Solution.isMonotonic(S) should be(o)
  }
  "The Solution" should "have isMonotonic 5" in {
    val S = Array(1, 1, 1)
    val o = true
    Solution.isMonotonic(S) should be(o)
  }
  "The Solution" should "have isMonotonic 6" in {
    val S = Array(1, 2, 3, 4, 5, 6, 7, 8, 8)
    val o = true
    Solution.isMonotonic(S) should be(o)
  }
  "The Solution" should "have isMonotonic 7" in {
    val S = Array(1, 2, 3, 4, 5, 6, 7, 8, 7)
    val o = false
    Solution.isMonotonic(S) should be(o)
  }
  "The Solution" should "have isMonotonic 8" in {
    val S = Array(11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5)
    val o = false
    Solution.isMonotonic(S) should be(o)
  }
  "The Solution" should "have isMonotonic 9" in {
    val S = Array(1, 1, 0)
    val o = true
    Solution.isMonotonic(S) should be(o)
  }
}
