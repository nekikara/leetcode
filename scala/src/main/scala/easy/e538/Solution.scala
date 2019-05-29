package easy.e538

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
  def convertBST(root: TreeNode): TreeNode = {
    convertBSTFromRight(root, 0)
  }

  def convertBSTFromRight(node: TreeNode, i: Int): TreeNode = {
    if (node == null) {
      return node
    }
    if (node.right == null) {
      node.value += i
      val left = convertBSTFromRight(node.left, node.value)
      node.left = left
      node
    } else {
      val right = convertBSTFromRight(node.right, i)
      val mLeft = maxLeft(right)
      val newNode = new TreeNode(node.value + mLeft)
      val left = convertBSTFromRight(node.left, newNode.value)
      newNode.right = right
      newNode.left = left
      newNode
    }
  }

  def maxLeft(node: TreeNode): Int = {
    if (node == null) {
      0
    } else {
      if (node.left == null) {
        node.value
      } else {
        maxLeft(node.left)
      }
    }
  }
}
