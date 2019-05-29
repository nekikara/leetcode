package easy.e876

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have middleNode" in {

    val a1 = new ListNode(1)
    a1.next = new ListNode(2)
    a1.next.next = new ListNode(3)
    a1.next.next.next = new ListNode(4)
    a1.next.next.next.next = new ListNode(5)


    val o1 = new ListNode(3)
    o1.next = new ListNode(4)
    o1.next.next = new ListNode(5)

    Solution.middleNode(a1) should be (o1)
  }
}
