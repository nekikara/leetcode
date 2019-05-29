package easy.e108

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have sortedArrayToBST 1" in {
    var image = Array(-10, -3, 0, 5, 9)
    val t = new TreeNode(0)
    t.left = new TreeNode(-3)
    t.left.left = new TreeNode(-10)
    t.right = new TreeNode(9)
    t.right.left = new TreeNode(5)
    Solution.sortedArrayToBST(image) should be(t)
  }
  "The Solution" should "have sortedArrayToBST 2" in {
    var image = Array(0)
    val t = new TreeNode(0)
    Solution.sortedArrayToBST(image) should be(t)
  }
  "The Solution" should "have sortedArrayToBST 3" in {
    var image = Array(0, 1)
    val t = new TreeNode(1)
    t.left = new TreeNode(0)
    Solution.sortedArrayToBST(image) should be(t)
  }
  "The Solution" should "have sortedArrayToBST 4" in {
    var image = Array.empty[Int]
    val t = null
    Solution.sortedArrayToBST(image) should be(t)
  }
  "The Solution" should "have sortedArrayToBST 5" in {
    var image = Array(0, 1, 2, 3, 4, 5)
    val t = new TreeNode(3)
    t.left = new TreeNode(1)
    t.left.left = new TreeNode(0)
    t.left.right = new TreeNode(2)
    t.right = new TreeNode(5)
    t.right.left = new TreeNode(4)
    Solution.sortedArrayToBST(image) should be(t)
  }
}
