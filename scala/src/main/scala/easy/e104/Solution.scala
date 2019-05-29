package easy.e104

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
  def maxDepth(root: TreeNode): Int = {
    digInto(root, 0)
  }

  def digInto(node: TreeNode, n: Int): Int = {
    if (node == null) {
      n
    } else {
      val current = n + 1
      Array(digInto(node.left, current), digInto(node.right, current)).max
    }
  }
}
