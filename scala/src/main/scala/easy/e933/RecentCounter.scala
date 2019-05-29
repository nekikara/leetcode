package easy.e933


class RecentCounter {
  private var ts = collection.mutable.MutableList[Int]()

  def ping(t: Int): Int = {
    ts += t
    val min = t - 3000
    ts = ts.filter(x => {
      min <= x
    })
    ts.size
  }
}
