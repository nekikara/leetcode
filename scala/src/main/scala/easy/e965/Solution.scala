package easy.e965


class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = _
  var right: TreeNode = _
}

object Solution {
  def isUnivalTree(root: TreeNode): Boolean = {
    var runTree = collection.mutable.Stack[TreeNode]()
    if (root.left != null) {
      runTree = root.left +: runTree

    }
    if (root.right != null) {
      runTree = root.right +: runTree
    }

    while (0 < runTree.size) {
      val node = runTree.pop
      if (root.value != node.value) {
        return false
      }
      if (node.left != null) {
        runTree = node.left +: runTree

      }
      if (node.right != null) {
        runTree = node.right +: runTree
      }
    }
    true
  }
}
