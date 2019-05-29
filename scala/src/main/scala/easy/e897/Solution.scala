package easy.e897

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Solution {
  def increasingBST(root: TreeNode): TreeNode = {
    var l = collection.mutable.Stack[Int]()
    inc(root, l)
    var curr = new TreeNode(0)
    var next = new TreeNode(0)
    l.foreach(t => {
      curr.value = t
      next.right = curr
      curr = next
      next = new TreeNode(0)
    })

    curr.right
  }

  def inc(node: TreeNode, s: collection.mutable.Stack[Int]): Any = {
    if (node.left != null) {
      inc(node.left, s)
    }
    s.push(node.value)
    if (node.right != null) {
      inc(node.right, s)
    }
  }
}
