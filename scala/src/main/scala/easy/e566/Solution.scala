package easy.e566

object Solution {
  def matrixReshape(nums: Array[Array[Int]],
                    r: Int,
                    c: Int): Array[Array[Int]] = {

    val rO = nums.length
    val cO = nums(0).length
    val count = rO * cO
    if (r * c != count) {
      nums
    } else {
      val l = collection.mutable.MutableList[Array[Int]]()
      var reshapedRow = collection.mutable.MutableList[Int]()
      nums.foreach(row => {
        row.foreach(cell => {
          if (reshapedRow.length == c) {
            l += reshapedRow.toArray
            reshapedRow = collection.mutable.MutableList[Int]()
          }
          reshapedRow += cell
        })
      })
      l += reshapedRow.toArray

      l.toArray
    }
  }
}
