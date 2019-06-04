package easy.e404

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}
object Solution {
  def sumOfLeftLeaves(root: TreeNode): Int = {

    def countLeftLeaves(node: TreeNode, isLeft: Boolean): Int = {
      if (node == null) {
        0
      } else {
        if (node.left == null && node.right == null && isLeft) {
          node.value
        } else {
          countLeftLeaves(node.left, isLeft = true) + countLeftLeaves(
            node.right,
            isLeft = false
          )
        }
      }
    }

    countLeftLeaves(root, isLeft = false)
  }

}
