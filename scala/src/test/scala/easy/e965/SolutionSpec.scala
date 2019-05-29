package easy.e965

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have isUnivalTree" in {
    val i1Node = new TreeNode(1)
    val i1SecondLeft = new TreeNode(1)
    i1SecondLeft.left = i1Node
    i1SecondLeft.right = i1Node
    val i1SecondRight = new TreeNode(1)
    i1SecondRight.left = null
    i1SecondRight.right = i1Node
    val i1 = new TreeNode(1)
    i1.left = i1SecondLeft
    i1.right = i1SecondRight

    Solution.isUnivalTree(i1) should be (true)
  }

  "Solution" should "have isUnivalTree2" in {
    val thirdTierTwo = new TreeNode(5)
    val thirdTierFive = new TreeNode(2)

    val secondTierLeft = new TreeNode(2)
    secondTierLeft.left = thirdTierFive
    secondTierLeft.right = thirdTierTwo

    val i1 = new TreeNode(2)
    i1.left = secondTierLeft
    i1.right = new TreeNode(2)

    Solution.isUnivalTree(i1) should be (false)
  }
}
