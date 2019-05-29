package easy.e206

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have reverseList 1" in {
    val i = new ListNode(1)
    i.next = new ListNode(2)
    i.next.next = new ListNode(3)
    i.next.next.next = new ListNode(4)
    i.next.next.next.next = new ListNode(5)

    val o = new ListNode(5)
    o.next = new ListNode(4)
    o.next.next = new ListNode(3)
    o.next.next.next = new ListNode(2)
    o.next.next.next.next = new ListNode(1)
    Solution.reverseList(i) should be(o)
  }
  "The Solution" should "have reverseList 2" in {
    val i = new ListNode(1)
    i.next = new ListNode(2)
    i.next.next = new ListNode(3)
    i.next.next.next = new ListNode(5)
    i.next.next.next.next = new ListNode(5)

    val o = new ListNode(5)
    o.next = new ListNode(5)
    o.next.next = new ListNode(3)
    o.next.next.next = new ListNode(2)
    o.next.next.next.next = new ListNode(1)
    Solution.reverseList(i) should be(o)
  }

  "The Solution" should "have reverseList 3" in {
    val i = new ListNode(1)

    val o = new ListNode(1)
    Solution.reverseList(i) should be(o)
  }
  "The Solution" should "have reverseList 4" in {
    val i = null

    val o = null
    Solution.reverseList(i) should be(o)
  }
}
