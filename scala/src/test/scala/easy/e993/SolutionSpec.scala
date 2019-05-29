package easy.e993

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have isCousins 1" in {
    val t = new TreeNode(1)
    t.left = new TreeNode(2)
    t.left.left = new TreeNode(4)
    t.right = new TreeNode(3)
    val x = 4
    val y = 3
    Solution.isCousins(t, x, y) should be(false)
  }
  "The Solution" should "have isCousins 2" in {
    val t = new TreeNode(1)
    t.left = new TreeNode(2)
    t.left.right = new TreeNode(4)
    t.right = new TreeNode(3)
    t.right.right = new TreeNode(5)
    val x = 5
    val y = 4
    Solution.isCousins(t, x, y) should be(true)
  }
  "The Solution" should "have isCousins 3" in {
    val t = new TreeNode(1)
    t.left = new TreeNode(2)
    t.left.right = new TreeNode(4)
    t.right = new TreeNode(3)
    val x = 2
    val y = 3
    Solution.isCousins(t, x, y) should be(false)
  }
  "The Solution" should "have isCousins 4" in {
    val t = new TreeNode(1)
    t.left = new TreeNode(3)
    t.right = new TreeNode(2)
    t.right.left = new TreeNode(7)
    t.right.right = new TreeNode(4)
    t.right.right.left = new TreeNode(5)
    t.right.right.left.right = new TreeNode(8)
    t.right.right.right = new TreeNode(6)
    t.right.right.right.right = new TreeNode(9)

    val x = 8
    val y = 9
    Solution.isCousins(t, x, y) should be(true)
  }
  "The Solution" should "have isCousins 5" in {
    val t = new TreeNode(1)
    t.left = new TreeNode(3)
    t.right = new TreeNode(2)
    t.right.left = new TreeNode(7)
    t.right.right = new TreeNode(4)
    t.right.right.left = new TreeNode(5)
    t.right.right.left.left = new TreeNode(9)
    t.right.right.left.right = new TreeNode(8)
    t.right.right.right = new TreeNode(6)

    val x = 8
    val y = 9
    Solution.isCousins(t, x, y) should be(false)
  }
}
