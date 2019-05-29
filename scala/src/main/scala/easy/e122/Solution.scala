package easy.e122

object Solution {
  def maxProfit(prices: Array[Int]): Int = {
    val max = prices.length
    var ans = 0
    for (i <- 1 until prices.length) {
      if (prices(i - 1) < prices(i)) {
        ans += prices(i) - prices(i - 1)
      }
    }
    ans
  }

  def gatherProfits(prices: Array[Int],
                    max: Int,
                    i: Int,
                    s: Int,
                    acc: Array[Int]): Int = {
    if (max <= i) {
      0
    } else {
      val price = prices(i)

      if (s == -1) {
        return gatherProfits(prices, max, i + 1, price, acc)
      }
      if (price < s) {
        gatherProfits(prices, max, i + 1, price, acc)
      } else {
        val newIndex = incrementIndex(prices, max, i + 1)
        val newP = prices(newIndex)
        acc(0) += (newP - s)
        gatherProfits(prices, max, newIndex + 1, -1, acc)
      }
    }
  }

  def incrementIndex(prices: Array[Int], max: Int, index: Int): Int = {
    if (max <= index) {
      index - 1
    } else {
      val pre = prices(index - 1)
      val next = prices(index)
      if (pre < next) {
        incrementIndex(prices, max, index + 1)
      } else {
        index - 1
      }
    }
  }
}
