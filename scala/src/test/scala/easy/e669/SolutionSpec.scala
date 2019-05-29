package easy.e669

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have trimBST 1" in {
    val a = new TreeNode(1)
    a.left = new TreeNode(0)
    a.right = new TreeNode(2)
    val l = 1
    val r = 2

    val o = new TreeNode(1)
    o.right = new TreeNode(2)
    Solution.trimBST(a, l, r) should be (o)
  }
  "Solution" should "have trimBST 2" in {
    val a = new TreeNode(3)
    a.left = new TreeNode(0)
    a.left.right = new TreeNode(2)
    a.left.right.left = new TreeNode(1)
    a.right = new TreeNode(4)
    val l = 1
    val r = 3

    val o = new TreeNode(3)
    o.left = new TreeNode(2)
    o.left.left = new TreeNode(1)
    Solution.trimBST(a, l, r) should be (o)
  }
  "Solution" should "have trimBST 3" in {
    val a = new TreeNode(3)
    a.left = new TreeNode(0)
    a.left.right = new TreeNode(2)
    a.left.right.left = new TreeNode(1)
    a.right = new TreeNode(4)
    val l = 1
    val r = 3

    val o = new TreeNode(3)
    o.left = new TreeNode(2)
    o.left.left = new TreeNode(1)
    Solution.trimBST(a, l, r) should be (o)
  }
  "Solution" should "have trimBST 4" in {
    val a = new TreeNode(8)
    a.left = new TreeNode(5)
    a.left.left = new TreeNode(0)
    a.left.left.right = new TreeNode(4)
    a.left.left.right.left = new TreeNode(2)
    a.left.left.right.left.left = new TreeNode(1)
    a.left.left.right.left.right = new TreeNode(3)

    a.right = new TreeNode(9)
    a.right.right = new TreeNode(10)
    val l = 9
    val r = 10

    val o = new TreeNode(9)
    o.right = new TreeNode(10)
    Solution.trimBST(a, l, r) should be (o)
  }
  "Solution" should "have trimBST 5" in {
    val a = new TreeNode(8)
    a.left = new TreeNode(5)
    a.left.left = new TreeNode(0)
    a.left.left.right = new TreeNode(4)
    a.left.left.right.left = new TreeNode(2)
    a.left.left.right.left.left = new TreeNode(1)
    a.left.left.right.left.right = new TreeNode(3)

    a.right = new TreeNode(9)
    a.right.right = new TreeNode(10)
    val l = 10
    val r = 10

    val o = new TreeNode(10)
    Solution.trimBST(a, l, r) should be (o)
  }
  "Solution" should "have trimBST 6" in {
    val a = new TreeNode(8)
    a.left = new TreeNode(5)
    a.left.left = new TreeNode(0)
    a.left.left.right = new TreeNode(4)
    a.left.left.right.left = new TreeNode(2)
    a.left.left.right.left.left = new TreeNode(1)
    a.left.left.right.left.right = new TreeNode(3)
    a.left.right = new TreeNode(6)
    a.left.right.right = new TreeNode(7)

    a.right = new TreeNode(9)
    a.right.right = new TreeNode(10)
    val l = 6
    val r = 9

    val o = new TreeNode(8)
    o.left = new TreeNode(6)
    o.left.right = new TreeNode(7)
    o.right = new TreeNode(9)
    Solution.trimBST(a, l, r) should be (o)
  }
}



