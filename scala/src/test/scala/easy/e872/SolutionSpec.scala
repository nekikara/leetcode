package easy.e872

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have leafSimilar" in {
    val a1 = new TreeNode(3)
    a1.left = new TreeNode(5)
    a1.left.left = new TreeNode(6)
    a1.left.right = new TreeNode(2)
    a1.left.right.left = new TreeNode(7)
    a1.left.right.right = new TreeNode(4)
    a1.right = new TreeNode(1)
    a1.right.left = new TreeNode(9)
    a1.right.right = new TreeNode(8)


    val a2 = new TreeNode(3)
    a2.left = new TreeNode(6)
    a2.right = new TreeNode(1)
    a2.right.left = new TreeNode(9)
    a2.right.left.left = new TreeNode(7)
    a2.right.left.right = new TreeNode(4)
    a2.right.right = new TreeNode(8)
    a2.right.right.left = new TreeNode(9)
    a2.right.right.right = new TreeNode(8)
    Solution.leafSimilar(a1, a2) should be (true)
  }

  "Solution" should "return true" in {
    val a1 = new TreeNode(1)
    a1.left = new TreeNode(2)

    val a2 = new TreeNode(2)
    a2.left = new TreeNode(2)
    Solution.leafSimilar(a1, a2) should be (true)
  }
}


