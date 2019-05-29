package easy.e538

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have convertBST 1" in {
    val i = new TreeNode(5)
    i.left = new TreeNode(2)
    i.right = new TreeNode(13)

    val o = new TreeNode(18)
    o.left = new TreeNode(20)
    o.right = new TreeNode(13)
    Solution.convertBST(i) should be(o)
  }
  "The Solution" should "have convertBST 2" in {
    val i = new TreeNode(5)
    i.left = new TreeNode(2)
    i.left.left = new TreeNode(1)
    i.left.right = new TreeNode(3)
    i.right = new TreeNode(13)

    val o = new TreeNode(18)
    o.left = new TreeNode(23)
    o.left.left = new TreeNode(24)
    o.left.right = new TreeNode(21)
    o.right = new TreeNode(13)
    Solution.convertBST(i) should be(o)
  }
  "The Solution" should "have convertBST 3" in {
    val i = new TreeNode(5)
    i.left = new TreeNode(2)
    i.left.left = new TreeNode(1)
    i.left.right = new TreeNode(3)
    i.right = new TreeNode(13)
    i.right.left = new TreeNode(10)
    i.right.right = new TreeNode(14)

    val o = new TreeNode(42)
    o.left = new TreeNode(47)
    o.left.left = new TreeNode(48)
    o.left.right = new TreeNode(45)
    o.right = new TreeNode(27)
    o.right.left = new TreeNode(37)
    o.right.right = new TreeNode(14)
    Solution.convertBST(i) should be(o)
  }
  "The Solution" should "have convertBST 4" in {
    val i = new TreeNode(0)
    i.left = new TreeNode(-1)
    i.left.left = new TreeNode(-3)
    i.right = new TreeNode(2)
    i.right.right = new TreeNode(4)

    val o = new TreeNode(6)
    o.left = new TreeNode(5)
    o.left.left = new TreeNode(2)
    o.right = new TreeNode(6)
    o.right.right = new TreeNode(4)
    Solution.convertBST(i) should be(o)
  }
}
