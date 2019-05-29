package easy.e1022

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have sumRootToLeaf 1" in {
    val t = new TreeNode(1)
    t.left = new TreeNode(0)
    t.left.left = new TreeNode(0)
    t.left.right = new TreeNode(1)
    t.right = new TreeNode(1)
    t.right.left = new TreeNode(0)
    t.right.right = new TreeNode(1)
    val o = 22
    Solution.sumRootToLeaf(t) should be(o)
  }
  "The Solution" should "have sumRootToLeaf 2" in {
    val t = new TreeNode(1)
    t.left = new TreeNode(1)
    val o = 3
    Solution.sumRootToLeaf(t) should be(o)
  }
}
