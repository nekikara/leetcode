package easy.e100

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}
object Solution {
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    treeToArray(p) sameElements treeToArray(q)
  }

  def treeToArray(node: TreeNode): Array[Int] = {
    if (node == null) {
      Array(-1)
    } else {
      Array(node.value) ++ treeToArray(node.left) ++ treeToArray(node.right)
    }
  }
}
