package easy.e944

object Solution {
  def minDeletionSize(A: Array[String]): Int = {
    var ans = 0
    0 to A(0).length - 1 foreach {i => {
      val mapped = 0 to A.length - 1 map {c => {
        A(c)(i)
      }}

      if (mapped.sorted.mkString == mapped.mkString) {
      } else {
        ans += 1
      }
    }}
    ans
  }
}
