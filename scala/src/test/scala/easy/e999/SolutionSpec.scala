package easy.e999

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have numRookCaptures" in {
    val i1 = Array(
      Array('.','.','.','.','.','.','.','.'),
      Array('.','.','.','p','.','.','.','.'),
      Array('.','.','.','R','.','.','.','p'),
      Array('.','.','.','.','.','.','.','.'),
      Array('.','.','.','.','.','.','.','.'),
      Array('.','.','.','p','.','.','.','.'),
      Array('.','.','.','.','.','.','.','.'),
      Array('.','.','.','.','.','.','.','.'),
    )
    val e1 = 3
    Solution.numRookCaptures(i1) should equal (e1)

    val i2 = Array(
      Array('.','.','.','.','.','.','.','.'),
      Array('.','p','p','p','p','p','.','.'),
      Array('.','p','p','B','p','p','.','.'),
      Array('.','p','B','R','B','p','.','.'),
      Array('.','p','p','B','p','p','.','.'),
      Array('.','p','p','p','p','p','.','.'),
      Array('.','.','.','.','.','.','.','.'),
      Array('.','.','.','.','.','.','.','.')
    )
    val e2 = 0
    Solution.numRookCaptures(i2) should equal (e2)

    val i3 = Array(
      Array('.','.','.','.','.','.','.','.'),
      Array('.','.','.','p','.','.','.','.'),
      Array('.','.','.','p','.','.','.','.'),
      Array('p','p','.','R','.','p','B','.'),
      Array('.','.','.','.','.','.','.','.'),
      Array('.','.','.','B','.','.','.','.'),
      Array('.','.','.','p','.','.','.','.'),
      Array('.','.','.','.','.','.','.','.')
    )
    val e3 = 3
    Solution.numRookCaptures(i3) should equal (e3)
  }
}

