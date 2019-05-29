package easy.e530

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have getMinimumDifference 1" in {
    val t = new TreeNode(1)
    t.right = new TreeNode(3)
    t.right.left = new TreeNode(2)
    Solution.getMinimumDifference(t) should be(1)
  }
  "The Solution" should "have getMinimumDifference 2" in {
    val t = new TreeNode(5)
    t.left = new TreeNode(3)
    t.left.left = new TreeNode(2)
    t.left.left.left = new TreeNode(1)
    t.left.right = new TreeNode(4)
    t.right = new TreeNode(8)
    t.right.left = new TreeNode(6)
    t.right.right = new TreeNode(7)
    t.right.right = new TreeNode(9)
    Solution.getMinimumDifference(t) should be(1)
  }
  "The Solution" should "have getMinimumDifference 3" in {
    val t = new TreeNode(1)
    t.right = new TreeNode(8)
    Solution.getMinimumDifference(t) should be(7)
  }
  "The Solution" should "have getMinimumDifference 4" in {
    val t = new TreeNode(2)
    t.right = new TreeNode(4443)
    t.right.left = new TreeNode(1329)
    t.right.left.right = new TreeNode(2917)
    t.right.left.right.right = new TreeNode(4406)
    Solution.getMinimumDifference(t) should be(37)
  }
  "The Solution" should "have getMinimumDifference 5" in {
    val t = new TreeNode(0)
    t.right = new TreeNode(4443)
    t.right.left = new TreeNode(1329)
    t.right.left.right = new TreeNode(2917)
    t.right.left.right.right = new TreeNode(4406)
    Solution.getMinimumDifference(t) should be(37)
  }
  "The Solution" should "have getMinimumDifference 6" in {
    val t = new TreeNode(0)
    t.right = new TreeNode(2236)
    t.right.left = new TreeNode(1277)
    t.right.left.left = new TreeNode(519)
    t.right.right = new TreeNode(2776)
    Solution.getMinimumDifference(t) should be(519)
  }
}
