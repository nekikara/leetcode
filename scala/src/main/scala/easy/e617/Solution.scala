package easy.e617

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = _
  var right: TreeNode = _
}

object Solution {
  def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {
    var value: Int = 0
    var left: TreeNode = new TreeNode(value)
    var right: TreeNode = new TreeNode(value)

    if (t1 == null && t2 == null) {
      return null
    } else if (t1 == null) {
      value = t2.value
      left = t2.left
      right = t2.right
    } else if (t2 == null) {
      value = t1.value
      left = t1.left
      right = t1.right
    } else {
      value = t1.value + t2.value
      left = mergeTrees(t1.left, t2.left)
      right = mergeTrees(t1.right, t2.right)
    }
    val n = new TreeNode(value)
    n.left = left
    n.right = right
    n
  }
}
