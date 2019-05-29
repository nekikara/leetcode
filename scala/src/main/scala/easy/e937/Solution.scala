package easy.e937

object Solution {
  def reorderLogFiles(logs: Array[String]): Array[String] = {
    val dig = collection.mutable.MutableList[String]()
    val let = collection.mutable.MutableList[(String, String)]()

    logs.foreach(l => {
      val last = l.last
      if (last.isDigit) {
        dig += l
      } else {
        val splitted = l.split(" ")
        val pair: (String, String) =
          (splitted.head, splitted.tail.mkString(" "))
        let += pair
      }
    })
    val sorted =
      let
        .sortWith((a, b) => {
          if (a._2 == b._2) {
            a._1 < b._1
          } else {
            a._2 < b._2
          }
        })
        .map(s => s"${s._1} ${s._2}")
    (sorted.toList ++ dig.toList).toArray
  }
}
