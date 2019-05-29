package easy.e897

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have smallestRangeI" in {
    val one = new TreeNode(1)
    val two = new TreeNode(2)
    two.left = one
    val four = new TreeNode(4)
    val three = new TreeNode(3)
    three.left = two
    three.right = four
    val seven = new TreeNode(7)
    val nine = new TreeNode(9)
    val eight = new TreeNode(8)
    eight.left = seven
    eight.right = nine
    val six = new TreeNode(6)
    six.right = eight
    val five = new TreeNode(5)
    five.left = three
    five.right = six


    val o1 = new TreeNode(1)
    o1.right = new TreeNode(2)
    o1.right.right = new TreeNode(3)
    o1.right.right.right = new TreeNode(4)
    o1.right.right.right.right = new TreeNode(5)
    o1.right.right.right.right.right = new TreeNode(6)
    o1.right.right.right.right.right.right = new TreeNode(7)
    o1.right.right.right.right.right.right.right = new TreeNode(8)
    o1.right.right.right.right.right.right.right.right = new TreeNode(9)
    Solution.increasingBST(five) should equal (o1)
  }
}




