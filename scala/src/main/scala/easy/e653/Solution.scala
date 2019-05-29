package easy.e653

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null

  override def equals(obj: Any): Boolean = {
    obj.toString == this.toString
  }

  override def toString: String = {
    var str = this.value.toString
    if (this.left == null & this.right == null) {
      return str
    }
    if (this.left != null) {
      str += s", ${this.left.toString}"
    } else {
      str += ", null"
    }
    if (this.right != null) {
      str += s", ${this.right.toString}"
    } else {
      str += ", null"
    }
    str
  }
}

object Solution {
  def findTarget(root: TreeNode, k: Int): Boolean = {
    val serialized = List(root.value) ::: serialize(root.left) ::: serialize(
      root.right
    )
    findTwo(serialized, 1, k, List[Int](root.value)) ||
    findTwo(serialized, 1, k, List.empty)
  }

  def serialize(node: TreeNode): List[Int] = {
    if (node == null) {
      List.empty[Int]
    } else {
      List(node.value) ::: serialize(node.left) ::: serialize(node.right)
    }
  }

  def findTwo(list: List[Int],
              index: Int,
              target: Int,
              li: List[Int]): Boolean = {
    if (li.length == 2) {
      return li.sum == target
    }
    if (list.length <= index) {
      false
    } else {
      findTwo(list, index + 1, target, li :+ list(index)) ||
      findTwo(list, index + 1, target, li)
    }
  }
}
