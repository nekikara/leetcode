package easy.e617

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "merge Trees" in {
    // Tree1
    val lfive = new TreeNode(5)
    val lthree = new TreeNode(3)
    lthree.left = lfive
    val ltwo = new TreeNode(2)
    val lone = new TreeNode(1)
    lone.left = lthree
    lone.right = ltwo

    // Tree2
    val rfour = new TreeNode(4)
    val rseven = new TreeNode(7)
    val rone = new TreeNode(1)
    rone.right = rfour
    val rthree = new TreeNode(3)
    rthree.right = rseven
    val rtwo = new TreeNode(2)
    rtwo.left = rone
    rtwo.right = rthree

    val aTree = Solution.mergeTrees(lone, rtwo)
    aTree.value should equal (3)
    aTree.left.value should equal (4)
    aTree.right.value should equal (5)
  }
}
