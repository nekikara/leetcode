package easy.e728

object Solution {
  def selfDivingNumbers(left: Int, right: Int): List[Int] = {
    var ans = List[Int]()
    left to right foreach {n => {
      val sN = n.toString
      var result = true
      sN.foreach(c => {
        if (c == '0') {
          result = false
        } else {
          result = result && ((n % c.toString.toInt) == 0)
        }
      })
      if (result) {
        ans = ans ::: List(n)
      }
    }}
    ans
  }
}

