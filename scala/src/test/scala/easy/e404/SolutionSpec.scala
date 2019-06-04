package easy.e404

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have sumOfLeftLeaves 1" in {
    val bits = new TreeNode(3)
    bits.left = new TreeNode(9)
    bits.right = new TreeNode(20)
    bits.right.left = new TreeNode(15)
    bits.right.right = new TreeNode(7)
    val output = 24
    Solution.sumOfLeftLeaves(bits) should be(output)
  }
  "The Solution" should "have sumOfLeftLeaves 2" in {
    val bits = new TreeNode(3)
    bits.left = new TreeNode(9)
    val output = 9
    Solution.sumOfLeftLeaves(bits) should be(output)
  }
}
