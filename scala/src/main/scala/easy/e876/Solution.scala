package easy.e876


class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object Solution {

  def middleNode(head: ListNode): ListNode = {
    var count = 0
    var x = head
    while (x.next != null) {
      x = x.next
      count += 1
    }
    count += 1
    val midIndex = count / 2 + 1

    var y = head
    var c = 1
    while (c != midIndex) {
      y = y.next
      c += 1
    }
    y
  }

}
