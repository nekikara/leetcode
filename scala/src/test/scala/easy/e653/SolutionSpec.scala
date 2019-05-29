package easy.e653

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have findTarget 1" in {
    val s = new TreeNode(5)
    s.left = new TreeNode(3)
    s.left.left = new TreeNode(2)
    s.left.right = new TreeNode(4)
    s.right = new TreeNode(6)
    s.right.right = new TreeNode(7)
    val t = 9
    val o = true
    Solution.findTarget(s, t) should be(o)
  }
  "The Solution" should "have findTarget 2" in {
    val s = new TreeNode(5)
    s.left = new TreeNode(3)
    s.left.left = new TreeNode(2)
    s.left.right = new TreeNode(4)
    s.right = new TreeNode(6)
    s.right.right = new TreeNode(7)
    val t = 28
    val o = false
    Solution.findTarget(s, t) should be(o)
  }
  "The Solution" should "have findTarget 3" in {
    val s = new TreeNode(2)
    s.left = new TreeNode(1)
    s.right = new TreeNode(3)
    val t = 4
    val o = true
    Solution.findTarget(s, t) should be(o)
  }
}
