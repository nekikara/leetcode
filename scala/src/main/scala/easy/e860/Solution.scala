package easy.e860

object Solution {
  def lemonadeChange(bills: Array[Int]): Boolean = {
    val mx = bills.length
    payBill(bills, 0, mx, collection.mutable.Map.empty[Int, Int])
  }

  def payBill(bills: Array[Int],
              index: Int,
              max: Int,
              coll: collection.mutable.Map[Int, Int]): Boolean = {
    if (max <= index) {
      true
    } else {
      val bill = bills(index)
      bill match {
        case 5 =>
          if (coll contains 5) {
            coll(5) += 1
          } else {
            coll += 5 -> 1
          }
        case 10 =>
          if (coll contains 5) {
            if (0 < coll(5)) {
              coll(5) -= 1
              if (coll contains 10) {
                coll(10) += 1
              } else {
                coll += 10 -> 1
              }
            } else {
              return false
            }
          } else {
            return false
          }
        case 20 =>
          if (coll.contains(5) && coll.contains(10) && 1 <= coll(5) && 1 <= coll(
                10
              )) {
            coll(5) -= 1
            coll(10) -= 1
            if (coll contains 20) {
              coll(20) += 1
            } else {
              coll += 20 -> 1
            }
          } else if (coll.contains(5) && 3 <= coll(5)) {
            coll(5) -= 3
            if (coll contains 20) {
              coll(20) += 1
            } else {
              coll += 20 -> 1
            }
          } else {
            return false
          }
      }

      payBill(bills, index + 1, max, coll)

    }
  }
}
