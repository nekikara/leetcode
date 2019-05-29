package easy.e784

object Solution {
  def letterCasePermutation(S: String): List[String] = {
    val ans = collection.mutable.MutableList.empty[String]
    permutation(S, 0, List.empty[String])
  }

  def permutation(S: String, index: Int, cases: List[String]): List[String] = {
    if (S.length <= index) {
      cases
    } else {
      val c = S(index)
      val cs = if (c.isDigit) {
        List[Char](c)
      } else {
        List[Char](c.toLower, c.toUpper)
      }

      val newCases = if (cases.isEmpty) {
        cs.map(_.toString)
      } else {
        cases.flatMap(cas => {
          cs.map(caseOne => {
            cas + caseOne.toString
          })
        })
      }

      permutation(S, index + 1, newCases)
    }
  }
}
