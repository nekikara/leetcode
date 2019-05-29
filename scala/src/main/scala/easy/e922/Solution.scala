package easy.e922

object Solution {

  def sortArrayByParityII(A: Array[Int]): Array[Int] = {
    var oddIndex = 1
    var evenIndex = 0
    val ans = collection.mutable.MutableList[Array[Int]]()
    A.foreach(a => {
      if (a % 2 == 0) {
        ans += Array(evenIndex, a)
        evenIndex += 2
      } else {
        ans += Array(oddIndex, a)
        oddIndex += 2
      }
    })
    ans.sortWith(_(0) < _(0)).map(n => n(1)).toArray
  }

}
