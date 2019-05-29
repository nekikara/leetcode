package easy.e700

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = _
  var right: TreeNode = _
}

object Solution {
  def searchBST(root: TreeNode, `val`: Int): TreeNode = {
    if (root == null) {
      return null
    }
    if (root.value == `val`) {
      return root
    }
    val leftNode = searchBST(root.left, `val`)
    if (leftNode != null && leftNode.value == `val`) {
      return leftNode
    }
    val rightNode = searchBST(root.right, `val`)
    if (rightNode != null && rightNode.value == `val`) {
      return rightNode
    }
    null
  }
}
