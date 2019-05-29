package easy.e530

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}
object Solution {
  def getMinimumDifference(root: TreeNode): Int = {
    println("===========")
    val col = collection.mutable.Set.empty[Int]
    collectDiff(
      root,
      root.right,
      collection.mutable.MutableList.empty[Int],
      col
    )
    collectDiff(root, root.left, collection.mutable.MutableList.empty[Int], col)
    println(col.mkString(", "))
    col.min
  }

  def collectDiff(parent: TreeNode,
                  node: TreeNode,
                  ans: collection.mutable.MutableList[Int],
                  col: collection.mutable.Set[Int]): Unit = {
    if (node != null) {
      println(s"=== node.value ${node.value} ===")

      val diff = node.value - parent.value
      println(s"ans : ${ans.mkString(", ")}")
      col += diff.abs

      var diffSum = diff
      ans.reverse.foreach(oldDiff => {
        diffSum += oldDiff
        println(s"diffSum : $diffSum, oldDiff : $oldDiff")
        if (diffSum != 0) {
          col += diffSum.abs
        }
      })
      collectDiff(node, node.right, ans :+ diff, col)
      collectDiff(node, node.left, ans :+ diff, col)
    }
  }
}
