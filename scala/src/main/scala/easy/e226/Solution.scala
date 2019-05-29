package easy.e226

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
  def invertTree(root: TreeNode): TreeNode = {
    if (root == null) {
      root
    } else {
      val node = new TreeNode(root.value)
      node.left = invertTree(root.right)
      node.right = invertTree(root.left)
      node
    }
  }
}
