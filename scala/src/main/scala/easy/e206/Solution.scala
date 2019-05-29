package easy.e206

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x

  override def equals(obj: Any): Boolean = {
    obj.toString == this.toString
  }
  override def toString: String = {
    s"$x -> " + (if (next == null) "null" else next.toString)
  }
}

object Solution {

  def reverseList(head: ListNode): ListNode = {
    var ite = head
    var ans: ListNode = null
    while (ite != null) {
      val x = new ListNode(ite.x)
      x.next = ans
      ans = x
      ite = ite.next
    }
    ans
  }

  def acc(node: ListNode, curr: ListNode): ListNode = {
    if (node == null) {
      return curr
    }

    val pre = new ListNode(node.x)
    pre.next = curr
    acc(node.next, pre)
  }
}
