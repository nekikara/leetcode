package easy.e606

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Solution {
  def tree2str(t: TreeNode): String = {
    if (t == null) {
      ""
    } else {
      if (t.left == null && t.right == null) {
        s"${t.value}"
      } else if (t.left == null) {
        s"${t.value}()(${tree2str(t.right)})"
      } else if (t.right == null) {
        s"${t.value}(${tree2str(t.left)})"
      } else {
        s"${t.value}(${tree2str(t.left)})(${tree2str(t.right)})"
      }
    }
  }
}
