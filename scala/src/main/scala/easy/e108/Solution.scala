package easy.e108

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
  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    val len = nums.length
    if (len == 0) {
      return null
    }
    if (len == 1) {
      return new TreeNode(nums.head)
    }
    val half = len / 2
    val node = new TreeNode(nums(half))
    val leftArray = nums.take(half - 0)
    val rightArray = nums.takeRight(len - half - 1)
    node.left = sortedArrayToBST(leftArray)
    node.right = sortedArrayToBST(rightArray)
    node
  }
}
