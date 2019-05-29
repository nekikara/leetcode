package easy.e748

object Solution {
  def shortestCompletingWord(licensePlate: String,
                             words: Array[String]): String = {
    val letters = licensePlate.filter(_.isLetter).map(_.toLower).sorted
    val x = words
      .map(word => {
        var lets = letters
        word
          .foreach(c => {
            val index = lets.indexOf(c)
            lets = lets.take(index) ++ lets.drop(index + 1)
          })

        if (lets.isEmpty) {
          word
        } else {
          null
        }
      })
      .filter(_ != null)
      .sortWith(_.length < _.length)
    x(0)
  }
}
