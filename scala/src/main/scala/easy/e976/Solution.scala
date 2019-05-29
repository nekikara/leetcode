package easy.e976

object Solution {
  def largestPerimeter(A: Array[Int]): Int = {
    val sorted = A.sortWith(_ > _)
    check(sorted, 0, 1, 2, 0)
  }

  def check(array: Array[Int], i: Int, j: Int, k: Int, perimeter: Int): Int = {
    if (perimeter != 0 || array.length <= k) {
      return perimeter
    }
    val a = array(i)
    val b = array(j)
    val c = array(k)

    if ((a + b > c) && (b + c > a) && (c + a) > b) {
      if (perimeter < (a + b + c)) {
        return check(array, i + 1, j + 1, k + 1, a + b + c)
      }
    }
    check(array, i + 1, j + 1, k + 1, perimeter)
  }
}
