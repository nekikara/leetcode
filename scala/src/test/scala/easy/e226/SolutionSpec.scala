package easy.e226

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have invertTree 1" in {
    val a = new TreeNode(4)
    a.left = new TreeNode(2)
    a.left.left = new TreeNode(1)
    a.left.right = new TreeNode(3)
    a.right = new TreeNode(7)
    a.right.left = new TreeNode(6)
    a.right.right = new TreeNode(9)

    val o = new TreeNode(4)
    o.left = new TreeNode(7)
    o.left.left = new TreeNode(9)
    o.left.right = new TreeNode(6)
    o.right = new TreeNode(2)
    o.right.left = new TreeNode(3)
    o.right.right = new TreeNode(1)
    Solution.invertTree(a) should be(o)
  }
  "Solution" should "have invertTree 2" in {
    val a = new TreeNode(5)
    a.left = new TreeNode(3)

    val o = new TreeNode(5)
    o.right = new TreeNode(3)

    Solution.invertTree(a) should be(o)
  }
  "Solution" should "have invertTree 3" in {
    val a = new TreeNode(5)
    a.left = new TreeNode(4)
    a.left.left = new TreeNode(3)

    val o = new TreeNode(5)
    o.right = new TreeNode(4)
    o.right.right = new TreeNode(3)

    Solution.invertTree(a) should be(o)
  }
  "Solution" should "have invertTree 4" in {
    val a = new TreeNode(5)

    val o = new TreeNode(5)
    Solution.invertTree(a) should be(o)
  }
  "Solution" should "have invertTree 5" in {
    val a = null

    val o = null
    Solution.invertTree(a) should be(o)
  }
}
