package easy.e637

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

object Solution {
  def averageOfLevels(root: TreeNode): Array[Double] = {
    val stock = collection.mutable.Stack[(Int, TreeNode)]()
    val ans =
      collection.mutable.MutableList[collection.mutable.MutableList[Int]]()
    val p = (0, root)
    stock.push(p)
    while (stock.nonEmpty) {
      val (n, node): (Int, TreeNode) = stock.pop
      if (node != null) {
        if (n < ans.length) {
          ans(n) += node.value
        } else {
          val c = collection.mutable.MutableList[Int]()
          c += node.value
          ans += c
        }
        stock.push((n + 1, node.left))
        stock.push((n + 1, node.right))
      }
    }

    println(ans.mkString(" "))
    ans
      .map(a => {
        val s = a.map(_.toDouble).sum
        val l = a.length.toDouble
        s / l
      })
      .toArray
  }
}
