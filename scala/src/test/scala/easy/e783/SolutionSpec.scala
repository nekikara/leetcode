package easy.e783

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have minDiffBST 1" in {
    val t = new TreeNode(4)
    t.left = new TreeNode(2)
    t.left.left = new TreeNode(1)
    t.left.right = new TreeNode(3)
    t.right = new TreeNode(6)
    Solution.minDiffInBST(t) should be(1)
  }
  "The Solution" should "have minDiffBST 2" in {
    val t = new TreeNode(0)
    t.right = new TreeNode(2236)
    t.right.left = new TreeNode(1277)
    t.right.left.left = new TreeNode(519)
    t.right.right = new TreeNode(2776)
    Solution.minDiffInBST(t) should be(519)
  }
}
