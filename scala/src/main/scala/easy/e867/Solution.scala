package easy.e867

object Solution {

  def transpose(A: Array[Array[Int]]): Array[Array[Int]] = {
    val x = collection.mutable.MutableList[Array[Int]]()
    for(i <- A(0).indices) {
      val n = A.map(a => {
        a(i)
      })
      x += n
    }
    x.toArray
  }
}
