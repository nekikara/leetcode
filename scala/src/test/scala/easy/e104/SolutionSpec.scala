package easy.e104

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have maxDepth 1" in {
    val a = new TreeNode(1)
    a.left = new TreeNode(0)
    a.right = new TreeNode(2)
    Solution.maxDepth(a) should be (2)
  }
  "Solution" should "have maxDepth 2" in {
    val a = new TreeNode(3)
    a.left = new TreeNode(9)
    a.right = new TreeNode(20)
    a.right.left = new TreeNode(15)
    a.right.right = new TreeNode(7)
    Solution.maxDepth(a) should be (3)
  }
  "Solution" should "have maxDepth 3" in {
    val a = null
    Solution.maxDepth(a) should be (0)
  }
  "Solution" should "have maxDepth 4" in {
    val a = new TreeNode(1)
    Solution.maxDepth(a) should be (1)
  }
  "Solution" should "have maxDepth 5" in {
    val a = new TreeNode(1)
    a.left = new TreeNode(3)
    a.left.left = new TreeNode(4)
    a.left.right = new TreeNode(10)
    a.left.right.left = new TreeNode(11)
    Solution.maxDepth(a) should be (4)
  }
}




