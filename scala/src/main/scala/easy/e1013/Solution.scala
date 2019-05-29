package easy.e1013

object Solution {
  def canThreePartsEqualSum(A: Array[Int]): Boolean = {
    val sum = A.sum
    val ave = sum / 3

    val ans = partitionSum(A, 1, A(0), ave, 1)
    ans
  }

  def partitionSum(A: Array[Int],
                   index: Int,
                   acc: Int,
                   ave: Int,
                   parts: Int): Boolean = {
    if (A.length <= index) {
      return ave == acc && parts == 3
    }
    if (ave == acc && parts < 3) {
      return partitionSum(A, index + 1, A(index), ave, parts + 1)
    }
    partitionSum(A, index + 1, acc + A(index), ave, parts)
  }
}
