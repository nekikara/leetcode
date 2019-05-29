package easy.e606

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have tree2str 1" in {
    val i = new TreeNode(1)
    i.left = new TreeNode(2)
    i.left.left = new TreeNode(4)
    i.right = new TreeNode(3)
    val o = "1(2(4))(3)"
    Solution.tree2str(i) should be(o)
  }
  "The Solution" should "have tree2str 2" in {
    val i = new TreeNode(1)
    i.left = new TreeNode(2)
    i.left.right = new TreeNode(4)
    i.right = new TreeNode(3)
    val o = "1(2()(4))(3)"
    Solution.tree2str(i) should be(o)
  }
  "The Solution" should "have tree2str 3" in {
    val i = new TreeNode(1)
    i.right = new TreeNode(2)
    i.right.right = new TreeNode(3)
    i.right.right.right = new TreeNode(4)
    val o = "1()(2()(3()(4)))"
    Solution.tree2str(i) should be(o)
  }
}
