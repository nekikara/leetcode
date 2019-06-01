package easy.e100

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "The Solution" should "have isSameTree 1" in {
    val i = new TreeNode(1)
    i.left = new TreeNode(2)
    i.right = new TreeNode(3)

    Solution.isSameTree(i, i) should be(true)
  }
  "The Solution" should "have isSameTree 2" in {
    val i = new TreeNode(1)
    i.left = new TreeNode(2)

    val is = new TreeNode(1)
    is.right = new TreeNode(2)

    Solution.isSameTree(i, is) should be(false)
  }
  "The Solution" should "have isSameTree 3" in {
    val i = new TreeNode(1)
    i.left = new TreeNode(2)
    i.right = new TreeNode(1)

    val is = new TreeNode(1)
    is.left = new TreeNode(1)
    is.right = new TreeNode(2)

    Solution.isSameTree(i, is) should be(false)
  }
}
