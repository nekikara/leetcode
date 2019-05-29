package easy.e344

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have reverseString" in {
    val a1 = Array('h','e','l','l','o')
    val o1 = Array('o','l','l','e','h')
    Solution.reverseString(a1) should be (o1)

    val a2 = Array('H','a','x','n','a','h')
    val o2 = Array('h','a','n','x','a','H')
    Solution.reverseString(a2) should be (o2)

    val a3 = Array('A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a')
    val o3 = Array('h','a','n','n','a','H')
    Solution.reverseString(a3) should be (o3)
  }
}

