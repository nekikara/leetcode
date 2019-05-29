package easy.e917

object Solution {
  def reverseOnlyLetters(S: String): String = {
    val stack = collection.mutable.Stack[Char]()

    val changed =
      S.toCharArray
        .map(c => {
          if (c.isLetter) {
            stack.push(c)
            ' '
          } else {
            c
          }
        })
        .map(c => {
          if (c == ' ') {
            stack.pop()
          } else {
            c
          }
        })

    changed.mkString
  }
}
