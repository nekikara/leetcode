package easy.e669

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
  def trimBST(root: TreeNode, L: Int, R: Int): TreeNode = {
    if (root == null) {
      root
    } else {
      if (L <= root.value && root.value <= R) {
        val o = new TreeNode(root.value)
        o.left = trimBST(root.left, L, R)
        o.right = trimBST(root.right, L, R)
        o
      } else if (root.value < L) {
        trimBST(root.right, L, R)
      } else {
        trimBST(root.left, L, R)
      }
    }
  }
}
