package easy.e783

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}
object Solution {
  def minDiffInBST(root: TreeNode): Int = {
    var min = Int.MaxValue
    val sorted = sortTree(root)

    for (i <- 1 until sorted.length) {
      val diff = sorted(i) - sorted(i - 1)
      if (diff < min) {
        min = diff
      }
    }
    min
  }

  def sortTree(root: TreeNode): List[Int] = {
    if (root == null) {
      List.empty[Int]
    } else {
      sortTree(root.left) ::: List[Int](root.value) ::: sortTree(root.right)
    }
  }
}
