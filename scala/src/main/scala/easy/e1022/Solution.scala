package easy.e1022

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}
object Solution {
  def sumRootToLeaf(root: TreeNode): Int = {
    gather(root, 0)
  }

  def gather(node: TreeNode, acc: Int): Int = {
    val x = acc << 1
    val newAcc = x + node.value

    if (node.left == null && node.right == null) {
      newAcc
    } else {
      val left = if (node.left == null) {
        0
      } else {
        gather(node.left, newAcc)
      }
      val right = if (node.right == null) {
        0
      } else {
        gather(node.right, newAcc)
      }
      left + right
    }
  }
}
