package easy.e811

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have subdomainVisits" in {
    val a1: Array[String] = Array("9001 discuss.leetcode.com")
    val o1: List[String] = List("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com")
    Solution.subdomainVisits(a1) should contain theSameElementsAs  o1

    val a2: Array[String] = Array("900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org")
    val o2: List[String] = List("901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com")
    Solution.subdomainVisits(a2) should contain theSameElementsAs  o2
  }
}


