package easy.e933

import org.scalatest._

class RecentCounterSpec extends FlatSpec with Matchers {
  "RecentCounter" should "have ping" in {
    val recentCounter = new RecentCounter()
    val i1: Int = 1
    val o1: Int = 1
    recentCounter.ping(i1) should equal (o1)

    val i2: Int = 100
    val o2: Int = 2
    recentCounter.ping(i2) should equal (o2)

    val i3: Int = 3001
    val o3: Int = 3
    recentCounter.ping(i3) should equal (o3)

    val i4: Int = 3002
    val o4: Int = 3
    recentCounter.ping(i4) should equal (o4)
  }
}
