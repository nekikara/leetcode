package easy.e993

class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null

  override def equals(obj: Any): Boolean = {
    obj.toString == this.toString
  }

  override def toString: String = {
    var str = this.value.toString
    if (this.left == null & this.right == null) {
      return str
    }
    if (this.left != null) {
      str += s", ${this.left.toString}"
    } else {
      str += ", null"
    }
    if (this.right != null) {
      str += s", ${this.right.toString}"
    } else {
      str += ", null"
    }
    str
  }
}

object Solution {
  def isCousins(root: TreeNode, x: Int, y: Int): Boolean = {
    val coll = collection.mutable.MutableList[(Int, Int)]()
    gather(root, x, y, 1, coll, -1)
    coll.head._1 != coll(1)._1 && coll.head._2 == coll(1)._2
  }

  def gather(root: TreeNode,
             x: Int,
             y: Int,
             k: Int,
             coll: collection.mutable.MutableList[(Int, Int)],
             parent: Int): Unit = {
    if (coll.length < 2) {
      if (root != null) {
        if (root.value == x || root.value == y) {
          val p = (parent, k)
          coll += p
        }
        gather(root.left, x, y, k + 1, coll, root.value)
        gather(root.right, x, y, k + 1, coll, root.value)
      }
    }
  }
}
