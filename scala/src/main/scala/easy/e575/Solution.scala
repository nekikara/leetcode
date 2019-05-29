package easy.e575

object Solution {
  def distributeCandies(candies: Array[Int]): Int = {
    val half = candies.length / 2
    Array(candies.toSet.size, half).min
  }
}
