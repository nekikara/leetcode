package easy.e872

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Solution {
  def leafSimilar(root1: TreeNode, root2: TreeNode): Boolean = {
    val left = leaValues(root1)
    val right = leaValues(root2)
    left == right
  }

  def leaValues(r: TreeNode): List[Int] = {
    if (r.left == null && r.right == null) {
      List(r.value)
    } else if (r.right == null) {
      leaValues(r.left)
    } else if (r.left == null) {
      leaValues(r.right)
    } else {
      leaValues(r.left) ++ leaValues(r.right)
    }
  }
}
