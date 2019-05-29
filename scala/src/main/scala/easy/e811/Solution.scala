package easy.e811

object Solution {
  def subdomainVisits(cpdomains: Array[String]): List[String] = {
    val m = collection.mutable.Map[String, Int]()
    cpdomains.foreach(d => {
      val parts = d.split(" ")
      val count = parts(0).toInt
      val domainParts = parts(1).split("\\.")
      val len = domainParts.length
      for (i <- domainParts.indices) {
        val subDomain = domainParts.takeRight(len - i).mkString(".")
        if (m contains subDomain) {
          m(subDomain) = m(subDomain) + count
        } else {
          m(subDomain) = count
        }
      }
    })

    m.map(M => {
      s"${M._2} ${M._1}"
    }).toList
  }
}
