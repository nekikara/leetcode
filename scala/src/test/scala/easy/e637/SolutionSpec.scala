package easy.e637

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have averageOfLevels 1" in {
    val a = new TreeNode(3)
    a.left = new TreeNode(9)
    a.right = new TreeNode(20)
    a.right.left = new TreeNode(15)
    a.right.right = new TreeNode(7)
    Solution.averageOfLevels(a) should be(Array(3, 14.5, 11))
  }
  "Solution" should "have averageOfLevels 2" in {
    Solution.averageOfLevels(null) should be(Array())
  }
  "Solution" should "have averageOfLevels 3" in {
    val a = new TreeNode(1)
    Solution.averageOfLevels(a) should be(Array(1))
  }
  "Solution" should "have averageOfLevels 4" in {
    val a = new TreeNode(3)
    a.left = new TreeNode(9)
    a.left.left = new TreeNode(10)
    a.left.right = new TreeNode(0)

    a.right = new TreeNode(20)
    a.right.left = new TreeNode(15)
    a.right.right = new TreeNode(7)
    Solution.averageOfLevels(a) should be(Array(3, 14.5, 8))
  }
  "Solution" should "have averageOfLevels 5" in {
    val a = new TreeNode(2147483647)
    a.left = new TreeNode(2147483647)
    a.right = new TreeNode(2147483647)
    Solution.averageOfLevels(a) should be(Array(2147483647.0, 2147483647.0))
  }
}
